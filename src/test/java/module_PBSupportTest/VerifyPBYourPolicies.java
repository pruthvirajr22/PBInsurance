package module_PBSupportTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import libraryFiles.BaseClass;
import libraryFiles.UtilityClass;
import module_PBLigin.PBLoginPage;
import module_PBLigin.PBLoginWithMobNumPage;
import module_PBLigin.PBSignInByPwdPage;
import module_PBSupport.PBSupport_MyPoliciesPage;
import module_PBSupport.PBSupport_Policies;

public class VerifyPBYourPolicies extends BaseClass
{
	PBSupport_Policies support;
	PBSupport_MyPoliciesPage myPolicies;
	PBLoginWithMobNumPage mobNum;
	PBSignInByPwdPage pass;
	PBLoginPage login;
	int TCID;
	
	
 @BeforeClass
 public void OpenApplication() throws IOException, InterruptedException 
 {
	 openBrowser();
	 login = new PBLoginPage(driver);
	 mobNum = new PBLoginWithMobNumPage(driver);
	 pass = new PBSignInByPwdPage(driver);
	 support = new PBSupport_Policies(driver);
	 myPolicies = new PBSupport_MyPoliciesPage(driver);
	 
	 
	 
	 Thread.sleep(5000);
 }
 
 @BeforeMethod
 public void openMyPoliciesPage() throws IOException 
 {
	 login.clickPBloginPageSignIn();
	 mobNum.inputPBLoginWithMobNumPageMobNum(UtilityClass.pfData("mobNum"));
	 mobNum.clickPBLoginWithMobNumPageSignInBypwd();
	 pass.inputPBSignInByPwdPagePassword(UtilityClass.pfData("pwd"));
	 pass.clickPBSignInByPwdPageSignIn();
	 support.moveToPBSupportDropdown();
	 support.clickPBSupport_PoliciesOption();
	 
 }
 @Test
 public void verifyPolicies() throws EncryptedDocumentException, IOException 
 {
	 TCID = 001;
	String actResult = myPolicies.getNoPolicyText();
	String expResult = UtilityClass.testData(4, 0, "sheet2");
	Assert.assertEquals(actResult, expResult);
 }
 
 @AfterMethod
 public void afterCompletionOfTest() throws IOException 
 {
	 UtilityClass.captureSS(driver, TCID);
 }
 
 @AfterClass
 public void closeBrowser() throws InterruptedException 
 {
	 Thread.sleep(3000);
	 driver.quit();
 }
 
 
 
}
