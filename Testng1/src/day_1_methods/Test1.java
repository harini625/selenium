//if we does not give priority it will execute first
package day_1_methods;

import org.testng.annotations.Test;

public class Test1 {
  //@Test(priority=1)
	
  
	public void opening_browser() {
	  System.out.println("application successfully open");
  
  }
  @Test(priority=2)
  public void product_details()
  {
	  System.out.println("successfully updated");
  }
  @Test(enabled=false)//to skip this method 
  public void customer_details()
  {
	  System.out.println("details");
  }
  @Test(priority=3)
  public void payment()
  {
	  System.out.println("successfull payment");
  }
  @Test(priority=4)
  public void loogout()
  {
	  System.out.println("logout successfull");
  }
}
