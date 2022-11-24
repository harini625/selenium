package Excels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pom2
	{
		WebDriver d;
		By fname=By.name("firstName");
		By lname=By.name("lastName");
		By phone=By.name("phone");
		pom2(WebDriver d)
		{
			this.d=d;
		}
		public void Fname()
		
		{
			d.findElement(fname).sendKeys("harini");
		}
		public void lname()
		{
			d.findElement(lname).sendKeys("Reddy");
		}
		public void phone()
		{
			d.findElement(phone).sendKeys("9492944728");
		}
	}


