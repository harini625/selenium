package Excels;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class DD_2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\excel\\DD2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
		ChromeDriver d=new ChromeDriver();
		d.get("https://demo.guru99.com/selenium/newtours/");
		d.manage().window().maximize();
		WebElement a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		List<WebElement>b=a.findElements(By.tagName("a"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			r.createCell(0).setCellValue(b.get(i).getText());
			b.get(i).click();
			d.navigate().back();
			
			String a1=d.getTitle();
			r.createCell(1).setCellValue(a1);
			
			a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
			b=a.findElements(By.tagName("a"));
			if(!b.get(i).isSelected())
			{
				r.createCell(1).setCellValue("pass");
			}
			else
			{
				r.createCell(1).setCellValue("fail");
			}
			
		}
		FileOutputStream f2=new FileOutputStream("C:\\excel\\DD2.xlsx");
		wb.write(f2);
		f2.close();
		
		
		
		

	}

}
