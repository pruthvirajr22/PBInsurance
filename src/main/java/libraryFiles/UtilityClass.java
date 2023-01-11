package libraryFiles;
//change-all test data we required fetch from excel sheet stored in selenium folder than stored at external folder.
//screenshot we can stored in selenium folder rather than stored at external folder.



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass 
{
	//this method is use to get PF data
		//need to pass String key & return String value
		//Author name: @Sanjay
	public static String pfData(String key) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\91968\\eclipse-workspace\\PBInsurance\\PropertyFiles.properties");
		
		Properties p = new Properties();
		p.load(file);
		String value = p.getProperty(key);
		return value;
	
	}
	
	//this method is use to capture screenshot on webpage
	//need to pass 2 inputs:  1.webDriver object   2.TCID
	//Author Name: @Sanjay 
 public static void captureSS(WebDriver driver,int id) throws IOException 
 {
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 
	 File dest = new File("C:\\Users\\91968\\eclipse-workspace\\PBInsurance\\Screenshot\\TC_ID"+id+".jpg");
	 //to use the code for any testcase having diff-different Id we do the concatination.
	 FileHandler.copy(src, dest);
 }
//this method is use to get test data from excel sheet
	//need to pass 3 inputs:  1.rowIndex   2.cellIndex 3. sheetName
	//Author Name: @Sanjay 
 public static String testData(int rowInd, int cellInd, String sheetName) throws EncryptedDocumentException, IOException 
 {
	 FileInputStream file = new FileInputStream("C:\\Users\\91968\\eclipse-workspace\\PBInsurance\\TestData\\policyBazaar1.xlsx");
		
	  org.apache.poi.ss.usermodel.Sheet sh = WorkbookFactory.create(file).getSheet(sheetName);
	 String values =  sh.getRow(rowInd).getCell(cellInd).getStringCellValue();
	  return values;
	 
 }
 
}
