package objectRepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver, framedriver;
	public RediffHomePage(WebDriver driver)
	{
		this.driver=driver;
		
		//this.framedriver=driver;
		//framedriver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='moneyiframe']")));
	}
	By searchPlace= By.xpath("//input[@id='srchword']");
	By searchButton =By.cssSelector("input[aria-label='Search']");
	
	public WebElement Search()
	{
		return driver.findElement(searchPlace);
		
	}
	
	public WebElement ClickSearch()
	{
		
		return driver.findElement(searchButton);
	}
	
	
	
}
