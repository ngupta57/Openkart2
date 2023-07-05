package openkart2pages;

import wrappers.GenericWrappers;

public class ForgotPasswordPage extends GenericWrappers {	
	
	public ForgotPasswordPage CheckHeaderText(String Data) {
		verifyTextByXpath(prop.getProperty("ForgotPasswordPage.HeaderTextForgotPassword.XPath"),Data);		
		return this;
	}
	
	public ForgotPasswordPage EnterEmail(String Data) {
		enterByXpath(prop.getProperty("ForgotPasswordPage.TxtFldEmail.XPath"),Data);		
		return this;
	}
	
	
	public LoginPage clickContinue() {
		clickByXpath(prop.getProperty("ForgotPasswordPage.Lnk_Continue.XPath"));		
		return new LoginPage();
	}
	
	


}
