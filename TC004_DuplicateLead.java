package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC004_DuplicateLead extends GenericWrappers
{
	@Test
	public void login() throws InterruptedException
	{
		invokeApp("chrome", "http://leaftaps.com/opentaps");
		enterById("username", "DemoSalesManager");
		enterById("password", "crmsfa");
		clickByClassName("decorativeSubmit");
		clickByLink("CRM/SFA");
		clickByXpath("//a[text()='Leads']");
		clickByXpath("//a[contains(text(),'Find Leads')]");
		clickByXpath("(//span[@class='x-tab-strip-inner'])[3]");
		enterByXpath("//input[@name='emailAddress']","demo@gmail.com");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(2000);
		String nameCapture=getTextByXpath("(//div[contains(@class,'x-grid3')]/a[@class='linktext'])[3]");
		System.out.println(nameCapture);
		Thread.sleep(2000);
		clickByXpath("(//div[contains(@class,'x-grid3')]/a[@class='linktext'])[1]");
		Thread.sleep(2000);
		clickByXpath("//a[@class='subMenuButton' and text()='Duplicate Lead']");
		Thread.sleep(2000);
		verifyTitle("Duplicate Lead | opentaps CRM");
		Thread.sleep(2000);
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		Thread.sleep(2000);
		verifyTextById("viewLead_firstName_sp",nameCapture);
		closeBrowser();
		
	
	}
	

}
