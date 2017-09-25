package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC001_LoginLeafTaps extends GenericWrappers{
	
	@Test
	public void login(){		
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		verifyTextContainsByXpath("//h2[contains(text(),'Welcome')]", "Welcome Demo Sales Manager");
		clickByClassName("decorativeSubmit");		
	}
}







