package openkart2pages;

import wrappers.GenericWrappers;

public class MyAccountPage extends GenericWrappers {	
	
	
	public MyAccountPage verifyMyAccountHeader(String Data, String dataValidity) {
		boolean flag =verifyTextByXpathReturnsBoolean(prop.getProperty("MyAccountPage.ConfirmText.XPath"),Data);
		
		if(dataValidity.equals("Valid")) {
			if(flag) {
			reportStep("The user with valid credentails logged in successfully", "pass");
			} else {
				reportStep("The user with valid credentails not logged in successfully", "fail");	
			}
		} else if(dataValidity.equals("Invalid")){
			
			if(flag) {
				reportStep("The user with invalid credentails logged in successfully", "fail");
				} else {
				reportStep("The user with invalid credentails not logged in successfully", "pass");	
				}
		}
		
		return this;
	}
	
	public MyAccountPage confirmMyAccountHeader(String Data ) {
		verifyTextByXpath(prop.getProperty("MyAccountPage.ConfirmText.XPath"),Data);
		return this;
	}
	
	public AccountLogoutPage clickLogout() {
		clickByXpath(prop.getProperty("AccountLogoutPage.Lnk_LogOut.XPath"));		
		return new AccountLogoutPage();
	}
	public AccountLogoutPage selectDrpdownLogout() {
		clickByXpath(prop.getProperty("MyAccountPage.dropDownLogout.XPath"));		
		return new AccountLogoutPage();
	}
	
	
}
