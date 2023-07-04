package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import wrappers.ProjectWrappers;

public class TC004_Login2 extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseName="TC004";
	testCaseDescription="Open Kart Login function";
	author="Narinder";
	category="Smoke";
	sheetname="TC003_Login";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";
}
	
	
  @Test(dataProvider="fetchData")
  public void openKart2Login(String email, String password ) {  
	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickLogin()
	  .EnterUserEmail(email)
	  .EnterPassword(password)
	  .clickLogin();
	  
  }
}