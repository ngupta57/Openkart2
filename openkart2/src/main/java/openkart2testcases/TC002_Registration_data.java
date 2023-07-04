package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import wrappers.ProjectWrappers;

public class TC002_Registration_data extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseDescription="Open Kart Registration";
	author="Narinder";
	category="Smoke";
	sheetname="TC001_Registration";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";
	
}
	
	
  @Test(dataProvider = "fetchData")
  public void openKart2Registration(String firstName, String lastName,String eMail, String telePhone,String password, String confirmPassword,String message) {
	  
	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickRegister()
	  .enterFirstName(firstName)
	  .enterLastName(lastName)
	  .enterEmail(eMail)
	  .enterTelPhone(telePhone)
	  .enterPassword(password)
	  .confirmPassword(confirmPassword)
	  .clickPrivacyPolicy()
	  .clickContnue()
	  .verifyMessage(message);
  }
}