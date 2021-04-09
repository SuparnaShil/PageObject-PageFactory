package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;
import objectRepository.RediffLoginPagePF;
 
public class LoginApp {

	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium file\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPagePF rediff = new RediffLoginPagePF(driver);
		
		rediff.EmailId().sendKeys("Hello");
		rediff.PassWord().sendKeys("12345");
		rediff.SignIn().click();
		rediff.Home().click();
		
		RediffHomePage rediffHome = new RediffHomePage(driver);
		
		rediffHome.Search().sendKeys("Mobile");
		rediffHome.ClickSearch().click();
		
	}
}
 