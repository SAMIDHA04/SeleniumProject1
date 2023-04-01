package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import Generic.BaseTest;
import Generic.ReadDatAFromExcel;
import POM.RegisterPage;
import POM.WelcomePage;

public class ValidRegistered extends BaseTest{
	
      @Test
      void validRegister() throws EncryptedDocumentException, IOException {
    	  ReadDatAFromExcel rdfe = new ReadDatAFromExcel();
    	  String firstname = rdfe.fetchData("Sheet1",0,0);
    	  String lastname = rdfe.fetchData("Sheet1",1,0);
    	  String email = rdfe.fetchData("Sheet1",2,0);
    	  String password = rdfe.fetchData("Sheet1", 3, 0);
    	  WelcomePage wp = new WelcomePage(driver);
    	  wp.getRegisterBTN().click();
    	  RegisterPage rp = new RegisterPage(driver);
    	  rp.getFemaleBTN().click();
    	  rp.getFirstNameBTN().sendKeys(firstname);
    	  rp.getLastNameBTN().sendKeys(lastname);
    	  rp.getEmailBTN().sendKeys(email);
    	  rp.getPasswordBTN().sendKeys(password);
    	  rp.getConfirmPasswordBTN().sendKeys(password);
    	  rp.getregisterbuttonBTN().click();
    	  
      }
	 
 
	
}
