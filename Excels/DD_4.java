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

public class DD_4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream f1=new FileInputStream("C:\\excel\\linkNames.xlsx");
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
				String a1=r.getCell(0).getStringCellValue();
				d.findElement(By.linkText(a1)).click();
				d.navigate().back();
				a=d.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
				b=a.findElements(By.tagName("a"));
				
				String exp=r.getCell(1).getStringCellValue();
				String act=d.getCurrentUrl();
				if(exp.equals(act))
				{
					r.createCell(2).setCellValue("pass");
				}
				else
				{
					r.createCell(2).setCellValue("fail");
				}
		}
		
		FileOutputStream f2=new FileOutputStream("C:\\excel\\linkNames.xlsx");
		wb.write(f2);
		f2.close();
		

	}

}
