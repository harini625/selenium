package Excels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM1{
	WebDriver d;
	By uname =By.name("userName");
	By pass =By.name("password");
	By button =By.name("submit");
	POM1(WebDriver d)
	{
		this.d=d;
		
	}
	public void uname()
	{
		d.findElement(uname).sendKeys("Admin");
		
	}
	public void pass()
	{
		d.findElement(pass).sendKeys("admin123");
	}
	public void signon()
	{
		d.findElement(button).click();
	}
}
