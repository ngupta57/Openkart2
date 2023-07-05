package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import wrappers.ProjectWrappers;

public class TC007_PasswordResetMail extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {	
	testCaseName="TC007_PasswordResetMail";
	testCaseDescription="Open KartPassword reset mail successful function";
	author="Narinder";
	category="Smoke";
	sheetname="TC007_PasswordResetMail";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";
}
	
	
  @Test(dataProvider="fetchData")
  public void openKart2PasswordResetMail(String email, String HeaderTxt,String EmailSuccess ) {  
	  
	  new HomePage() 
	  .clickMyAccount()
	  .clickLogin()
	  .clickForgotPasswordLnk()
	  .CheckHeaderText(HeaderTxt)
	  .EnterEmail(email)
	  .clickContinue()
	  .VerifyResetMailSuccess(EmailSuccess);
	  
  }
}