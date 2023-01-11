package module_PBSupport;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import libraryFiles.BaseClass;

public class demo extends BaseClass
{
	public static WebDriver driver;
 public static void main(String[]args) throws IOException 
 {
	 BaseClass b = new BaseClass();
	 b.openBrowser();
	 PBSupport_Policies p = new PBSupport_Policies(driver);
	 p.moveToPBSupportDropdown();
	 p.clickPBSupport_PoliciesOption();
 }
}
