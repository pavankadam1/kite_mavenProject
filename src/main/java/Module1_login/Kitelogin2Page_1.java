package Module1_login;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitelogin2Page_1
{
	//decalaration
	
	@FindBy(xpath = "//input[@type='password']") private WebElement pin;
	
	@FindBy(xpath = "//button[@type='submit']") private WebElement contnbtn;
	
	//initialization within constructor
	
	public Kitelogin2Page_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage --method
	
	public void  inpKiteLogin1Page_1pin(String userpin)
	{
		pin.sendKeys(userpin);
	}
	
	public void clickKiteLogin1Page_1contnbtn()
	{
		contnbtn.click();
		
	}

}
