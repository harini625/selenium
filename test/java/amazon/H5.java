package amazon;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class H5 {
	WebDriver d;
	@Given("user open new tours page")
	public void user_open_new_tours_page() {
	   System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	   d=new ChromeDriver();
	   d.get("https://demo.guru99.com/test/newtours/index.php");
	   d.manage().window().maximize();
	}

	@When("user need to click register link")
	public void user_need_to_click_register_link() throws InterruptedException {
	   d.findElement(By.linkText("REGISTER")).click();
	   Thread.sleep(2000);
	}

	@Then("user need to get country name from drop down")
	public void user_need_to_get_country_name_from_drop_down() throws IOException {
		FileInputStream f1=new FileInputStream("C:\\excel\\Excep1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f1);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		WebElement a=d.findElement(By.name("country"));
		List<WebElement>b=a.findElements(By.tagName("option"));
		System.out.println(b.size());
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i).getText());
			r=ws.createRow(i);
			//r.createCell(0).setCellValue(i+1);
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
			FileOutputStream f2=new FileOutputStream("C:\\excel\\Excep1.xlsx");
			wb.write(f2);
			f2.close();
		}
	}

	@And("user navigate back to the home back")
	public void user_navigate_back_to_the_home_back() {
		d.navigate().back();
	    
	}

	@And("user close the browser")
	public void user_close_the_browser() {
	    d.close();
	}


}
