package module_PBLogin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogin1HomePage
{
 @FindBy(xpath = "//div[@class='userprofile']") private WebElement myAcctDropdn;
 @FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfile;
 WebDriver driver1;
 
 public PBLogin1HomePage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
	 driver1=driver;
 }
 public void moveToPBLogin1HomePagemyAcctDropdn() 
 {
	 Actions ac = new Actions(driver1);
	 ac.moveToElement(myAcctDropdn).perform();
 }
 public void clickPBLogin1HomePagemyProfile() 
 {
	 myProfile.click(); 
 }
}
