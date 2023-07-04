package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import wrappers.ProjectWrappers;

public class TC001_Registration extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseDescription="Open Kart Registration";
	author="Narinder";
	category="Smoke";
	sheetname="TC001_Registration";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";	
}
	
	
  @Test
  public void openKart2Registration() {
	  
	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickRegister()
	  .enterFirstName("Narinder")
	  .enterLastName("Gupta")
	  .enterEmail("ng@gmail.com")
	  .enterTelPhone("789 900 9878")
	  .enterPassword("test1234")
	  .confirmPassword("test1234")
	  .clickPrivacyPolicy()
	  .clickContnue()
	  .verifyMessage("Your Account Has Been Created!");
  }
}