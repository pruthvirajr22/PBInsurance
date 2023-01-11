package module_PBLogin1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage
{
 @FindBy(xpath = "//a[@class='sign-in']") private WebElement signInBttn;
 
 public PBLoginPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void clickPBLoginPagesignInBttn() 
 {
	 signInBttn.click();
	 
 }
 
}
