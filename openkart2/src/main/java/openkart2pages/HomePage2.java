package openkart2pages;

import wrappers.GenericWrappers;

public class HomePage2 extends GenericWrappers {
	
	public HomePage2 clickMyAccount() {
		clickByXpath(prop.getProperty("HomePage.MyAccount.XPath"));
		
		return this;
	}
	public AccountRegistrationPage clickRegister() {
		clickByLink(prop.getProperty("HomePage.MyAccount.Link"));
		
		return new AccountRegistrationPage () ;
	}
	public LoginPage clickLogin() {
		clickByXpath(prop.getProperty("HomePage.LogIn.XPath"));
		
		return new LoginPage () ;
	}
	public CameraPage clickCamera() {
		clickByXpath(prop.getProperty("HomePage.lnkCamera.XPath"));
		
		return new CameraPage () ;
	}


}
