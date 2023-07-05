package openkart2testcases;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import openkart2pages.MyAccountPage;
import wrappers.ProjectWrappers;

public class TC005_LoginDDT extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseName="TC005";
	testCaseDescription="Open Kart LogiDDT function";
	author="Narinder";
	category="Smoke";
	sheetname="TC005_LoginDDT";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";	
}
	
	
@Test(dataProvider="fetchData")
  public void openKart2LoginDDT(String email, String password,String DataValidity) {	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickLogin()
	  .EnterUserEmail(email)
	  .EnterPassword(password)
	  .clickLogin()
	  .verifyMyAccountHeader("My Account", DataValidity)
	  .clickLogout()
	  .ConfirmLogoutMsg("You have been logged off your account. It is now safe to leave the computer."); 	  
		
  }
}