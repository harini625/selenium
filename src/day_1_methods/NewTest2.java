package day_1_methods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
  @BeforeClass
  public void login() {
	  System.out.println("login");
  }
  @Test
  public void operation()
  {
	  System.out.println("successfully");
  }
  @AfterClass
  public void logout()
  {
	  System.out.println("logout successfull");
  }
}
