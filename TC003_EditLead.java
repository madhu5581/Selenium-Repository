package testCases;

import org.junit.Test;

import wrappers.GenericWrappers;

public class TC003_EditLead extends GenericWrappers
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
		enterByXpath("(//input[@name='firstName'])[3]", "Madhusudhanan");
		clickByXpath("//button[contains(text(),'Find Leads')]");
		Thread.sleep(2000);
		clickByXpath("(//div[contains(@class,'x-grid3')]/a[@class='linktext'])[1]");
		verifyTitle("View Lead | opentaps CRM");
		clickByXpath("//a[@class='subMenuButton' and text()='Edit']");
		enterById("updateLeadForm_companyName", "Testing & co");
		clickByXpath("(//input[@class='smallSubmit'])[1]");
		verifyTextById("viewLead_companyName_sp","Testing & co");
		closeBrowser();
	}

}
