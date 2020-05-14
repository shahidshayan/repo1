package samplemavenprojectc;

import resource.Base;
import resource.SuccessfulLoginPageRepo;
import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SuccessfulLoginTest extends Base{
		
		@BeforeTest
		public void initialize() throws IOException {
			driver=initializeDriver();
			driver.get(prop.getProperty("url"));
		}
		
		@Test 
		public void successfulloginTest() throws IOException {
			
			SuccessfulLoginPageRepo slp = new SuccessfulLoginPageRepo (driver);
			slp.getuserName().sendKeys("username");
			
		}
		
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
}
