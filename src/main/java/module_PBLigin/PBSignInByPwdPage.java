package module_PBLigin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInByPwdPage 
{
 @FindBy(xpath = "//input[@type='password']") private WebElement pwd;
 @FindBy(xpath = "//span[@id='login-in-with-password-span']") private WebElement signInBttn;
 
 public PBSignInByPwdPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void inputPBSignInByPwdPagePassword(String password) 
 {
	 pwd.sendKeys(password);
 }
 
 public void clickPBSignInByPwdPageSignIn() 
 {
	 signInBttn.click();
 }
}
