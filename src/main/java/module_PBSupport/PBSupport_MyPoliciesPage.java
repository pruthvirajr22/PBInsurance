package module_PBSupport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSupport_MyPoliciesPage 
{
 @FindBy(xpath = "//div[@class='textCenter']") private WebElement checkPolicies;
 
 public PBSupport_MyPoliciesPage(WebDriver driver) 
 {
	 PageFactory.initElements(driver, this);
 }
 
 public String getNoPolicyText() 
 {
	String text = checkPolicies.getText();
	return text;
 }
}
