package Module1_login;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogin1Page_1 
{
	//step-1 declaration
	
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement lginbtn;
	
	//initialization within constructor
	
	public KiteLogin1Page_1 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage--mathods
	public void inpKiteLogin1Page_1Username(String username)
	{
	    UN.sendKeys(username);
	}
	
	public void inpKiteLogin1Page_1password(String password)
	{
		pwd.sendKeys(password);
	}
	
	public void clickKiteLogin1Page_1loginbtn()
	
	{
		
		lginbtn.click();
		
	}
	
	
	

}
