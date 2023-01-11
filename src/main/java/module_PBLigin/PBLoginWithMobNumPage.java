package module_PBLigin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginWithMobNumPage 
{
 @FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNum;
 @FindBy(xpath = "(//span[@id='central-login-sign-in-with-password-span'])[2]") private WebElement signInBypwd;
 
 public PBLoginWithMobNumPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void inputPBLoginWithMobNumPageMobNum(String number) 
 {
	 mobNum.sendKeys(number);
	 
 }
 public void clickPBLoginWithMobNumPageSignInBypwd() 
 {
	 signInBypwd.click();
 }
}
