package resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccessfulLoginPageRepo {
	
	WebDriver driver;
	public SuccessfulLoginPageRepo(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);	
	
	}
	
	@FindBy(id ="email")
	WebElement username;
	
	
	public WebElement getuserName() {
		
		return username;
	}

}
