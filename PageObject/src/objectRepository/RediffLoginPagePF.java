package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPagePF {

	WebDriver driver;
	public RediffLoginPagePF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	/*By username =By.xpath("//input[@id='login1']");
	By pass = By.name("passwd");
	By sign = By.name("proceed");
	By RediffPage = By.linkText("rediff.com");*/
	
	@FindBy(xpath="//input[@id='login1']")
	WebElement username;
	
	@FindBy(name="passwd")
	WebElement pass;
	
	@FindBy(name="proceed")
	WebElement sign;
	
	@FindBy(linkText="rediff.com")
	WebElement RediffPage;
	
	
	public WebElement EmailId()
	{
		return username;		
	}
	
	public WebElement PassWord()
	{
		return pass;
	}
	
	public WebElement SignIn()
	{
		return sign;
	}
	
	public WebElement Home()
	{
		return RediffPage;
	}
	
	
	
	
}
