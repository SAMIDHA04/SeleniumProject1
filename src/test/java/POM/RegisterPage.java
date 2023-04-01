package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	public RegisterPage (WebDriver driver){
	    	PageFactory.initElements(driver, this);
	    }
	 
	@FindBy (xpath="//label[text()=\"Female\"]" )
	private WebElement FemaleBTN;
	public WebElement getFemaleBTN() {
		return FemaleBTN;
	}
	
	@FindBy (id="FirstName" )
	private WebElement FirstNameBTN;
	public WebElement getFirstNameBTN() {
		return FirstNameBTN;
	}
	
	@FindBy (id="LastName" )
	private WebElement LastNameBTN;
	public WebElement getLastNameBTN() {
		return LastNameBTN;
	}
	
	@FindBy (id="Email" )
	private WebElement EmailBTN;
	public WebElement getEmailBTN() {
		return EmailBTN;
	}
	
	@FindBy (id="Password" )
	private WebElement PasswordBTN;
	public WebElement getPasswordBTN() {
		return PasswordBTN;
	}
	
	@FindBy (id="ConfirmPassword" )
	private WebElement ConfirmPasswordBTN;
	public WebElement getConfirmPasswordBTN() {
		return ConfirmPasswordBTN;
	}
	
	@FindBy (id="register-button" )
	private WebElement registerbuttonBTN;
	public WebElement getregisterbuttonBTN() {
		return registerbuttonBTN;
	}
}
