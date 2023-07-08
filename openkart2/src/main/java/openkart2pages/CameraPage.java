package openkart2pages;

import wrappers.GenericWrappers;

public class CameraPage extends GenericWrappers {	
	
	public CameraPage CheckCameraPageHeader() {
		verifyIsElementDisplayedByXpath(prop.getProperty("CameraPage.HeaderText.XPath"));		
		return this;
	}
	public CameraPage SelectSortdropdownByXPath(String VisibleText) {
		selectVisibleTextByXpath(prop.getProperty("CameraPage.SortByDropdn.XPath"),VisibleText);		
		return this;
	}
	public CameraPage SelectShowdropdownByXPath(String VisibleText2) {
		selectVisibleTextByXpath(prop.getProperty("CameraPage.ShowLimitDropdn.XPath"),VisibleText2);		
		return this;
	}
	
	public HomePage2 clickHomeIcon() {
		clickByXpath(prop.getProperty("CameraPage.HomePageLink.XPath"));		
		return new HomePage2();
	}
}
