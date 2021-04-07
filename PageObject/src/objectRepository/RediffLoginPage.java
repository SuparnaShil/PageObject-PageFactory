package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;
	public RediffLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By username =By.xpath("//input[@id='login1']");
	By pass = By.name("passwd");
	By sign = By.name("proceed");
	By RediffPage = By.linkText("rediff.com");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
		
	}
	
	public WebElement PassWord()
	{
		return driver.findElement(pass);
	}
	
	public WebElement SignIn()
	{
		return driver.findElement(sign);
	}
	
	public WebElement Home()
	{
		return driver.findElement(RediffPage);
	}
	
	
	
	
}
