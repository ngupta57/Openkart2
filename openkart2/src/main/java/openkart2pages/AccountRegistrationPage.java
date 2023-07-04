package openkart2pages;

import wrappers.GenericWrappers;

public class AccountRegistrationPage extends GenericWrappers{
	
public AccountRegistrationPage enterFirstName (String Data) {
	enterByName(prop.getProperty("AccountRegistrationPage.FirstName.Name"),Data);
	return this;	
}

public AccountRegistrationPage enterLastName (String Data) {
	enterById(prop.getProperty("AccountRegistrationPage.LastName.Id"),Data);
	return this;		
}
public AccountRegistrationPage enterEmail (String Data) {
	enterByXpath(prop.getProperty("AccountRegistrationPage.Email.XPath"),Data);
	return this;		
}
public AccountRegistrationPage enterTelPhone (String Data) {
	enterByXpath(prop.getProperty("AccountRegistrationPage.Telephone.XPath"),Data);
	return this;		
}	
public AccountRegistrationPage enterPassword (String Data) {
	enterByXpath(prop.getProperty("AccountRegistrationPage.Password.XPath"),Data);
	return this;		
}	
public AccountRegistrationPage confirmPassword (String Data) {
	enterByXpath(prop.getProperty("AccountRegistrationPage.ConfirmPassword.XPath"),Data);
	return this;		
}
public AccountRegistrationPage clickPrivacyPolicy () {
	clickByXpath(prop.getProperty("AccountRegistrationPage.PrivacyPolicy.XPath"));
	return this;		
}
public AccountRegistrationPage clickContnue() {
	clickByXpath(prop.getProperty("AccountRegistrationPage.Continue.XPath"));
	return this;
	}
public AccountRegistrationPage verifyMessage(String message) {
	verifyTextByXpath(prop.getProperty("AccountRegistrationPage.ConfirmationMessage.XPath"), message);
	return this;	
}}
