package openkart2pages;

import wrappers.GenericWrappers;

public class LoginPage extends GenericWrappers {	
	
	public LoginPage EnterUserEmail(String Data) {
		enterByXpath(prop.getProperty("LoginPage.Txt_Email.XPath"),Data);		
		return this;
	}
	public LoginPage EnterPassword(String Data) {
		enterById(prop.getProperty("LoginPage.Txt_Password.Id"),Data);		
		return this;
	}
	
	public MyAccountPage clickLogin() {
		clickByXpath(prop.getProperty("LoginPage.Bttn_Login.XPath"));		
		return new MyAccountPage();
	}
	
	


}
