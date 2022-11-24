package multiple_browsers;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test2 extends test1{
	@Test(priority=4)
	  public void geturl() {
		  System.out.println(d.getCurrentUrl());
	  }
	@Test(priority=5)
	  public void dropdown() {
		d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]")).click();
		  WebElement a=d.findElement(By.xpath("//*[@id=\"searchDropdownBox\"]"));
		  List<WebElement> c=d.findElements(By.tagName("option"));
		  System.out.println(c.size());
		  for(int i=0;i<c.size();i++) {
			  System.out.println(c.get(i).getText());
		  }
	  }
	

	  @Test(priority=6)
	  public void screenshot() throws IOException {
		  File s=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		  Files.copy(s,new  File("C://screenshots/img1.png"));
	  }

}
