/**
 * 
 */
package SgnupPagefac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author HP
 *
 */
public class SignupPage {
	
	WebDriver driver;
	
public SignupPage(WebDriver driver) {
		
		this.driver= driver;
	}
		
	@FindBy(xpath= "//*[@id=\"bs\"]/ul/li[3]/a")
	WebElement signupbutton; 
	
	@FindBy(how=How.ID,using="firstname")
	WebElement firstname;
	
	@FindBy(id="lastname")
	WebElement lastname;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirm_password']")
	WebElement confirm_password;
	
	
	public void sign_up(String nfirstname, String nlastname, String nemail, String npassword, String ncnfPass) {
	 	
		signupbutton.click();
		firstname.sendKeys(nfirstname);
		lastname.sendKeys(nlastname);
		email.sendKeys(nemail);
		password.sendKeys(npassword);
		confirm_password.sendKeys(ncnfPass);
		
	}
//	public void signup_button() {
//		signupbutton.click();	
//	}
//	
//	public void first_name(String nfirstname) {
//		firstname.sendKeys(nfirstname);
//	}
//
//	public void last_name(String nLastname) {
//		lastname.sendKeys(nLastname);
//	}
}
