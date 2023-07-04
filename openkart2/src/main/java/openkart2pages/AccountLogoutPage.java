package openkart2pages;

import wrappers.GenericWrappers;

public class AccountLogoutPage extends GenericWrappers {	

	
	public HomePage clickContinue() {
		clickByXpath(prop.getProperty("AccountLogoutPage.Lnk_Continue.XPath"));		
		return new HomePage();
	}
	public AccountLogoutPage ValidateHeader(String Data) {
		verifyTextByXpath(prop.getProperty("AccountLogoutPage.AccountHeaderText.XPath"),Data);		
		return this;
	}
	
	public AccountLogoutPage ConfirmLogoutMsg(String Data) {
		verifyTextByXpath(prop.getProperty("AccountLogoutPage.TXT_LogoutMsg.XPath"),Data);		
		return this;
	}


}
