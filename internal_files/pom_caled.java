package internal_files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pom_caled {
	WebDriver d;
	By country =By.name("country");
	pom_caled(WebDriver d) throws IOException
	{
		this.d=d;
		FileInputStream f1=new FileInputStream("C:\\Users\\Sowjanya\\eclipse-workspace\\practice\\src\\internal_files\\pom.properties");
		Properties p1=new Properties();
		p1.load(f1);
		d.findElement(By.name("firstName")).sendKeys(p1.getProperty("fname"));
		d.findElement(By.name("lastName")).sendKeys(p1.getProperty("lname"));
		d.findElement(By.name("phone")).sendKeys(p1.getProperty("phone"));
		d.findElement(By.id("userName")).sendKeys(p1.getProperty("username"));
		d.findElement(By.name("address1")).sendKeys(p1.getProperty("address"));
		d.findElement(By.name("city")).sendKeys(p1.getProperty("city"));
		d.findElement(By.name("state")).sendKeys(p1.getProperty("state"));
		d.findElement(By.name("postalCode")).sendKeys(p1.getProperty("code"));
	}
	public void country() throws IOException
	{
		FileInputStream f2=new FileInputStream("C:\\excel\\POM1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f2);
		XSSFSheet ws=wb.createSheet("Sheet1");
		Row r=null;
		Cell c=null;
		WebElement a=d.findElement(By.xpath("country"));
		List<WebElement> b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			
		}
		
	}

}
