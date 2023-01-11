package libraryFiles;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass 
{
	public WebDriver driver;
	//change- application url taken from utility class, driver path stored in selenium folder than at external folder 
 
 public  void openBrowser() throws IOException 
 {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\91968\\eclipse-workspace\\PBInsurance\\Browsers\\chromedriver.exe");
		
	 driver = new ChromeDriver();
	driver.get(UtilityClass.pfData("url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
 }
 // now we extends this class to test class, as we call this method in non static method so no need to create
 //an object.
}
