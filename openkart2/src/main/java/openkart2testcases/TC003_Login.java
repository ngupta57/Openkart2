package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import openkart2pages.MyAccountPage;
import wrappers.ProjectWrappers;

public class TC003_Login extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseDescription="Open Kart Login function";
	author="Narinder";
	category="Smoke";
	sheetname="TC003_Login";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";	
}
	
	
  @Test
  public void openKart2Login() {
	  
	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickLogin()
	  .EnterUserEmail("Narinder.gupta@gmail.com")
	  .EnterPassword("Test1234")
	  .clickLogin();
	 
	  
  }
}