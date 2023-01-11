package module_PBLogin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogin1WithPassPage 
{
 @FindBy(xpath = "//input[@type='password']") private WebElement passTextbox;
 @FindBy(xpath = "//span[@id='login-in-with-password-span']") private WebElement signInBttn;
 
 public PBLogin1WithPassPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void inputPBLogin1WithPassPagepassTextbox(String pass) 
 {
	 passTextbox.sendKeys(pass);
 }
 
 public void clickPBLogin1WithPassPage() 
 {
	 signInBttn.click();
 }
}
