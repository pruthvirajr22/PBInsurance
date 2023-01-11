package module_PBLogin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogin1WithMobileNumPage 
{
 @FindBy(xpath = "(//input[@type='number'])[2]") private WebElement mobNumTextBox;
 @FindBy(xpath = "(//span[@id='central-login-sign-in-with-password-span'])[2]") private WebElement signInByPassBttn;
 
 public PBLogin1WithMobileNumPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void inputPBLogin1WithMobileNumPagemobNumTextBox(String num) 
 {
	 mobNumTextBox.sendKeys(num);
 }
 
 public void clickPBLogin1WithMobileNumPagesignInByPassBttn() 
 {
	 signInByPassBttn.click();
 }
 
}
