package module_PBSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSupport_Policies 
{
 @FindBy(xpath = "//a[text()='Support']") private WebElement supportDropdown;
 @FindBy(xpath = "//span[@class='strong']") private WebElement policiesOption;
 WebDriver driver1;
 
 public PBSupport_Policies(WebDriver driver ) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public void moveToPBSupportDropdown() 
 {
	 Actions ac = new Actions(driver1);
	 ac.moveToElement(supportDropdown).perform();
 }
 public void clickPBSupport_PoliciesOption() 
 {
	 policiesOption.click();
 }
}
