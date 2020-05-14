package resource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
		public static WebDriver driver;
		public Properties prop; 

		public WebDriver initializeDriver() throws IOException {
		     prop=new Properties();
			FileInputStream fis =new FileInputStream("");
			prop.load(fis);
			
			String browserName=prop.getProperty("browser");
			if (browserName.equals("chrome")) {
			
	            System.setProperty("webdriver.chrome.driver","Path\\Chromedriver.exe");
	            
				 driver=new ChromeDriver();
				 driver.get(prop.getProperty("url"));
			}
			else if (browserName.equals("firefox")){
				System.setProperty("webdriver.chrome.driver","Path\\Gecko.exe");
				 driver=new FirefoxDriver();
				 driver.get(prop.getProperty("url"));
			}
			else if(browserName.equals("IE")) {
				System.setProperty("webdriver.chrome.driver","Path\\InternetExplorer.exe");
				 driver = new InternetExplorerDriver();
				 driver.get(prop.getProperty("url"));
				
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			return driver;
		}

	}


