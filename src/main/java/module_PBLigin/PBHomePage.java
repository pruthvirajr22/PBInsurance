package module_PBLigin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBHomePage
{
 @FindBy(xpath = "//div[@class='userprofile']") private WebElement myAcct;
 @FindBy(xpath = "//span[text()=' My profile ']") private WebElement myProfile;
 WebDriver driver1;
 
 public PBHomePage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
	 driver1=driver;
 }
 
 public void identifyPBHomePageMyAcct() 
 {
	 Actions ac = new Actions(driver1);
	 ac.moveToElement(myAcct).perform();
 }
 public void clickPBHomePageMyprofile() 
 {
	 myProfile.click();
 }
}
