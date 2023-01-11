package module_PBLigin;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyAcctPage 
{
 @FindBy(xpath = "(//input[@type='text'])[1]") private WebElement profNm;
 WebDriver driver1;
 
 public PBMyAcctPage(WebDriver driver) 
 {
	PageFactory.initElements(driver, this); 
	driver1=driver;
 }
 
 public void switchToPBMyAcctPage() 
 {
	 Set<String> allIds = driver1.getWindowHandles();
	 ArrayList<String> al = new ArrayList<String>(allIds);
	 driver1.switchTo().window(al.get(1));
 }
/* public void verifyPBMyAcctPageProfName(String name) 
 {
	String actPF = profNm.getAttribute("value");   //always select value='profile name'.
	
	String expPF =name;
	
	if(actPF.equals(expPF)) 
	{
		System.out.println("pass");
	}
	else 
	{
		System.out.println("fail");
	}
 }*/
 
 //we dont need to write the above code we just want to get actual profileNm
 
 public String getProfileName() 
 {
	String name =  profNm.getAttribute("value");
	 return name;
 }
}
