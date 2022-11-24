package day_1_methods;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest1 {
  @BeforeMethod
  public void login() {
	  System.out.println("login Successfully open");
  }
  @Test
  public void operation()
  {
	  System.out.println("performed Successfully");
  }
  @AfterMethod
  public void logout()
  {
	  System.out.println("logout successfull");                                                                     
  }
}
