package SgnupPagefac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ReporterConfig.Property;
import org.testng.annotations.Test;

public class Newsclickrun {
	
	//Property properties;
	String URL="https://support.newsclick.in/";
	
@Test
public void Newsclick() {
	
	System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(URL);
	
	SignupPage sign= PageFactory.initElements(driver, SignupPage.class);
	
	sign.sign_up("Rahul", "Singh", "rahulsingh@yopmail.com", "Rahul@123", "Rahul@123");
	
	
	//driver.quit();
}


}
