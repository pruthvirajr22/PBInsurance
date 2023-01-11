package module_PBLogin1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLogin1MyAcctPage 
{
 @FindBy(xpath = "(//input[@type='text'])[1]") private WebElement pfName;
 WebDriver driver1;
 
 public PBLogin1MyAcctPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
	 driver1=driver;
 }
 
 public void PBLogin1MyAcctPage() 
 {
	 Set<String> allIds = driver1.getWindowHandles();
	 ArrayList<String> al = new ArrayList<String>(allIds);
	 driver1.switchTo().window(al.get(1));
	 
 }
 
 public String verifyPBLogin1MyAcctPagepfName() 
 {
	 String profName = pfName.getAttribute("value");
	 return profName;
 }
}
