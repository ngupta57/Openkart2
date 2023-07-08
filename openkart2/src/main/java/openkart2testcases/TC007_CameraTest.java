package openkart2testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import openkart2pages.HomePage;
import openkart2pages.HomePage2;
import openkart2pages.MyAccountPage;
import wrappers.ProjectWrappers;

public class TC007_CameraTest extends ProjectWrappers {
	
@BeforeClass	

public void setConditions() {
	testCaseName="TC007_CameraTest";
	testCaseDescription="Open Kart Camera page function";
	author="Narinder";
	category="Smoke";
	sheetname="TC007_Camera";
	url ="http://localhost/opencart/upload/";
	browserName="chrome";	
}
	
	
  @Test(dataProvider = "fetchData")
  public void openKart2Camera(String SortVisibleText,String ShowVisibleText) {
	  
	  
	  new HomePage2() 
	  .clickCamera()
	  .CheckCameraPageHeader()
	  .SelectSortdropdownByXPath(SortVisibleText)
	  .SelectShowdropdownByXPath(ShowVisibleText)
	  .clickHomeIcon();	  
	 
	  
  }
}