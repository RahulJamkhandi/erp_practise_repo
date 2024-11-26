package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.ess.generic.fileutility.ExcelUtility;
import com.erp.ess.generic.webdriverutility.JavaUtility;

import lombok.Getter;

@Getter
public class NewThirdPartyPage {

	WebDriver driver;
	ExcelUtility excelUtility = new ExcelUtility();
	JavaUtility javaUtility = new JavaUtility();

	public NewThirdPartyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'New Third Party')]")
	private WebElement newThirdPartyBtn;

	@FindBy(id = "name")
	private WebElement ThirdParty_Name;

	@FindBy(xpath = "//span[@class='select2-selection select2-selection--single flat']")
	private WebElement prospect_Customer;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	private WebElement prospect_CustomerTF;
	
	@FindBy(id = "select2-fournisseur-container")
	private WebElement vendorOption;
	
	@FindBy(xpath = "(//input[@type='search'])[4]")
	private WebElement vendorTF;

	@FindBy(id = "select2-status-container")
	private WebElement statusSelect;
	
	@FindBy(xpath = "(//input[@class='select2-search__field'])[4]")
	private WebElement statusTF; 

	@FindBy(xpath = "//input[@value='Create third party']")
	private WebElement createThirdPartyBtn;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement cancelBtn;

	public void createNewThirdparty() throws Throwable {
		int randomNumber = javaUtility.getRandomNumber();
		String thirdPartyName = excelUtility.getDataFromExcel("TP", 1, 1);
		String prospectOrCustomerValue = excelUtility.getDataFromExcel("TP", 2, 1);
		String vendorStatus = excelUtility.getDataFromExcel("TP", 3, 2);
		String status = excelUtility.getDataFromExcel("TP", 4, 1);

		NewThirdPartyPage newThirdPartyPage = new NewThirdPartyPage(driver);
		newThirdPartyPage.getNewThirdPartyBtn().click();
		newThirdPartyPage.getThirdParty_Name().click();
		newThirdPartyPage.getThirdParty_Name().sendKeys(thirdPartyName + randomNumber);
		newThirdPartyPage.getProspect_Customer().click();
		newThirdPartyPage.getProspect_CustomerTF().click();
		newThirdPartyPage.getProspect_CustomerTF().sendKeys(prospectOrCustomerValue+Keys.ENTER);
		newThirdPartyPage.getVendorOption().click();
		newThirdPartyPage.getVendorTF().sendKeys(vendorStatus+Keys.ENTER);
		newThirdPartyPage.getStatusSelect().click();
		newThirdPartyPage.getStatusTF().sendKeys(status+Keys.ENTER);
		newThirdPartyPage.getCreateThirdPartyBtn().click();
	}

}
