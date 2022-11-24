package multiple_browsers;

import org.testng.annotations.Test;

public class test3 extends test2{
	@Test(priority=6)
	  public void login() {
		  System.out.println("logged in  success");
	  }
@Test(priority=7)
public void close() {
	  d.close();
}


}
