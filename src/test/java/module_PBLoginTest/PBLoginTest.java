package module_PBLoginTest;
// In this we call browser open code from base class and testdata from excel and sceernshot 
//capture code call from utilityClass


import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryFiles.BaseClass;
import libraryFiles.UtilityClass;
import module_PBLigin.PBHomePage;
import module_PBLigin.PBLoginPage;
import module_PBLigin.PBLoginWithMobNumPage;
import module_PBLigin.PBMyAcctPage;
import module_PBLigin.PBSignInByPwdPage;

public class PBLoginTest extends BaseClass
{
	Sheet sh;
	
	PBLoginPage signIn;
	PBLoginWithMobNumPage mobNum;
	PBSignInByPwdPage pass;
	PBHomePage hmPage;
	PBMyAcctPage myacct;
	int TCID;
 @BeforeClass	
 public void openBrowserMethods() throws EncryptedDocumentException, IOException, InterruptedException 
 { 
		 openBrowser();
		//object of pom class
		signIn = new PBLoginPage(driver);
		//page2 login by mob number
		 mobNum = new PBLoginWithMobNumPage(driver);
		//page3 login by password page
		 pass = new PBSignInByPwdPage(driver);
		//page4 pb home page
		 hmPage = new PBHomePage(driver);

		//page5 pb my acct page
		 myacct = new PBMyAcctPage(driver);
		
 }
 @BeforeMethod
 public void signInPB() throws InterruptedException, EncryptedDocumentException, IOException 
 {
	 signIn.clickPBloginPageSignIn();
	 mobNum.inputPBLoginWithMobNumPageMobNum(UtilityClass.pfData("mobNum"));
	 mobNum.clickPBLoginWithMobNumPageSignInBypwd();
	 pass.inputPBSignInByPwdPagePassword(UtilityClass.pfData("pwd"));
	 pass.clickPBSignInByPwdPageSignIn();
	 Thread.sleep(5000);
 }
 @Test
 public void verifyPBProfileName() throws EncryptedDocumentException, IOException, InterruptedException 
 {
	 TCID=001;
	 hmPage.identifyPBHomePageMyAcct();
	 hmPage.clickPBHomePageMyprofile();
	 Thread.sleep(5000);
	 myacct.switchToPBMyAcctPage();
	
	 String actProfileName = myacct.getProfileName();
	 String expProfileName = UtilityClass.testData(0,1,"sheet2");
	 
	 Assert.assertEquals(actProfileName, expProfileName,"Failed:actual profile name is not equal to expected");
	 
 }
 @AfterMethod
 public void logout(ITestResult s1) throws IOException 
 {
	if(s1.getStatus()==ITestResult.FAILURE)
	{
		UtilityClass.captureSS(driver,TCID);
	}
 }
 @AfterClass
 public void closeBrowser() throws InterruptedException 
 {
	 Thread.sleep(5000);
	 driver.quit();
 }
}
