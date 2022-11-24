package Excels;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DD_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f=new FileInputStream("C:\\excel\\DD1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		//String baseurl="https://www.amazon.com/"
		//d.get(baseurl);
		d.get("https://www.amazon.com/");
		d.manage().window().maximize();
		//d.findElement(By.id("searchDropdownBox")).click();
		WebElement a=d.findElement(By.id("searchDropdownBox"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(b.get(i).getText());
			b.get(i).click();
			
			if(!b.get(i).isSelected())
			{
				r.createCell(1).setCellValue("fail");
			}
			else
			{
				r.createCell(1).setCellValue("pass");
			}
		}
		FileOutputStream f2=new FileOutputStream("C:\\excel\\DD1.xlsx");
		wb.write(f2);
		f2.close();
		

	}

}
