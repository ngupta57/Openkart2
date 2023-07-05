package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import wrappers.ProjectWrappers;

public class TC006_LogoutDropdwnMyAccount extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseName="TC006_LogoutDropdwnMyAccount";
	testCaseDescription="Open Kart Logout from myaccount dropdown logout item function";
	author="Narinder";
	category="Smoke";
	sheetname="TC006_Logout";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";
}
	
	
  @Test(dataProvider="fetchData")
  public void openKart2Logout(String email, String password, String logoutmsg) {  
	  
	   new HomePage() 
	  .clickMyAccount()
	  .clickLogin()
	  .EnterUserEmail(email)
	  .EnterPassword(password)
	  .clickLogin()	  
	  .confirmMyAccountHeader("My Account")	   
	   .clickLogout()
	   .ConfirmLogoutMsg(logoutmsg)
	   .clickContinue();
	   
  
	  
  }
}