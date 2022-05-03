package Module1_login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KitelHomePage_1 
{
	//decalaration
	
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userId;
	@FindBy(xpath = "//div[@id='app']//text()[1]") private WebElement Nifty50;
	@FindBy(xpath = "//span[@data-balloon='Open chart']") private WebElement Nifty50disply;
	@FindBy(xpath = "//span[@class='icon icon-exit']") private WebElement logoutbtn;
	@FindBy(xpath = "//span[@class='user-id']") private WebElement clickuserId;
	@FindBy(xpath = "//span[text()='Dashboard']") private WebElement username;

	//span[@class='icon icon-exit']
	//iniialization within constructor
	
	public KitelHomePage_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//usage--method
	
//	public void verifyKitelHomePage_1UserID(String expid)
//	{
//		String actid = userId.getText();
//		
//		
//		if(actid.equals(expid))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("fail");
//		}
//		
//	}
	public String getKiteHomePageUserID()iop[]\
	
	{
		String actUserID = userId.getText();
		return actUserID;
	}
	public String getKiteHomeageUsername() 
	{
		
		String actnifty= username.getText();
		return actnifty;
		
	}
	public String getKiteHomePagenifty50displaued() 
	{
		String actnifty= Nifty50.getText();
		return actnifty;
		
	}
	public void getstringdisply()
	{

		Nifty50disply.click();
	     
	}
	
	public void logout()
	{
		clickuserId.click();
		logoutbtn.click();
	}

	



}
