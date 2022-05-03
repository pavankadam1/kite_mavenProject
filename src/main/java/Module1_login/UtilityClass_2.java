package Module1_login;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;

public class UtilityClass_2 
{
	////private static final String (TakesScreenshot)driver) = null;
	//utility class--
	//this method is used to get data from excel sheet
	//need to parameters 1.rowindex  ,  2. colmnindex
	//Authore name = pavan
	
	public static String logindata(int rowindex, int colmnindex ) throws EncryptedDocumentException, IOException
	{                                           //working C:\\Users\\ADMIN\\eclipse-workspace\\apachePoi\\test data\\Book2.xlsx
		                                           
		FileInputStream file = new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\kite_mavenProject\\TestData\\Book2.xlsx");		
		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
		
		
		String value = sh.getRow(rowindex).getCell(colmnindex).getStringCellValue();
		
		return value;
		
	}
	
//	public static  double logindata1(int rowindex, int colmnindex ) throws EncryptedDocumentException, IOException
//	{
//		//if numeric data sh.getnumriccellvalue
	
//		FileInputStream file = new FileInputStream("C:\\\\software files\\\\selenium_exel\\\\Book2.xlsx");
//		
//		Sheet sh = WorkbookFactory.create(file).getSheet("sheet2");
//		
//		
//		  double value = sh.getRow(0).getCell(0).getNumericCellValue();
//		
//		return value;
//		
//	}
	
	public static  void capturedscreeshot1(WebDriver driver , int TCID) throws IOException
	{
		File scr1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
      //File scr =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Des= new File("C:\\\\Users\\\\ADMIN\\\\eclipse-workspace\\\\apachePoi\\\\Screenshots\\"+TCID+".jpg");

	   FileHandler.copy(scr1, Des);
	
	}
	
	public static String GetPFdata(String key) throws IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\ADMIN\\eclipse-workspace\\apachePoi\\propertyFile.properties");
	
		Properties pr =new Properties();
		
		pr.load(file);
		
	
		String value = pr.getProperty(key);
	
		return value;
	
	}

}
