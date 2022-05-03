package Module1_loginTest;

import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Module1_login.UtilityClass_2;

public class baseClass1 extends UtilityClass_2
{
	//initialize browser  --extend in testclass
	public WebDriver driver;
	
	public void initializebrowser1() throws IOException
	{
		
		//initialize browser we need to extend this class into pom class

				System.setProperty("webdriver.edge.driver", "C:\\software files\\edge driver\\edgedriver_win64\\msedgedriver.exe");
				
				 driver = new EdgeDriver();     //WebDriver remove
				
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				 
				driver.manage().window().maximize();
				
				driver.get(UtilityClass_2.GetPFdata("URL"));

		
		
		
	}

}
