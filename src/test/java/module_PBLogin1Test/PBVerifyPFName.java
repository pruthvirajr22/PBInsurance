package module_PBLogin1Test;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryFiles.BaseClass;
import libraryFiles.UtilityClass;
import module_PBLogin1.PBLogin1HomePage;
import module_PBLogin1.PBLogin1MyAcctPage;
import module_PBLogin1.PBLogin1WithMobileNumPage;
import module_PBLogin1.PBLogin1WithPassPage;
import module_PBLogin1.PBLoginPage;

public class PBVerifyPFName extends BaseClass
{
 PBLoginPage login;
 PBLogin1WithMobileNumPage mobNum;
 PBLogin1WithPassPage pass;
 PBLogin1HomePage homepage;
 PBLogin1MyAcctPage myAcct;
 int TCID;
 
 @BeforeClass
 public void openApplication() throws IOException 
 {
	openBrowser();
	
	login = new PBLoginPage(driver);
	mobNum = new PBLogin1WithMobileNumPage(driver);
	pass = new PBLogin1WithPassPage(driver);
	homepage = new PBLogin1HomePage(driver);
	myAcct = new PBLogin1MyAcctPage(driver);
 }
 
 @BeforeMethod
 public void loginToPB() throws IOException 
 {
	 login.clickPBLoginPagesignInBttn();
	 mobNum.inputPBLogin1WithMobileNumPagemobNumTextBox(UtilityClass.pfData("mobNum"));
	 mobNum.clickPBLogin1WithMobileNumPagesignInByPassBttn();
	 pass.inputPBLogin1WithPassPagepassTextbox(UtilityClass.pfData("pwd"));
	 pass.clickPBLogin1WithPassPage();
	 
 }
 
 @Test
 public void verifyPFName() throws InterruptedException, EncryptedDocumentException, IOException 
 {
	 Thread.sleep(3000);
	 TCID=002;
	 homepage.moveToPBLogin1HomePagemyAcctDropdn();
	 homepage.clickPBLogin1HomePagemyProfile();
	 Thread.sleep(3000);
	 myAcct.PBLogin1MyAcctPage();
	 String actPFName = myAcct.verifyPBLogin1MyAcctPagepfName();
	 String expPFName = UtilityClass.testData(0, 2, "sheet2");
	 Assert.assertEquals(actPFName, expPFName);
	 
 }
 
 @AfterMethod
 public void afterTest(ITestResult s1) throws IOException 
 {
	if(s1.getStatus() == ITestResult.FAILURE) 
	{
		UtilityClass.captureSS(driver, TCID);
	}
 }
 
 @AfterClass
 public void closeBrowser() throws InterruptedException 
 {
	 Thread.sleep(3000);
	 driver.quit();
 }
}
