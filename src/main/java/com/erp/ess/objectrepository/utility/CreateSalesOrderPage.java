package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.generic.fileutility.ExcelUtility;
import com.erp.ess.generic.webdriverutility.JavaUtility;

import lombok.Getter;

@Getter
public class CreateSalesOrderPage extends BaseClass {

	WebDriver driver;
	ExcelUtility excelUtility = new ExcelUtility();
	JavaUtility javaUtility = new JavaUtility();
	
	public CreateSalesOrderPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='New order']")
	private WebElement newSalesOrderLink;

	@FindBy(name = "ref_client")
	private WebElement refCustomer;

	@FindBy(id = "reButtonNow")
	private WebElement dateNowBtn;

	@FindBy(id = "select2-socid-container")
	private WebElement thirdPartyTF;

	@FindBy(name = "save")
	private WebElement createDraftBtn;

	@FindBy(name = "cancel")
	private WebElement cancelBtn;

	@FindBy(xpath = "//span[@title='Create third party']")
	private WebElement createThirdPartyBtn;

	@FindBy(id = "name")
	private WebElement thirdPartyName;

	@FindBy(name = "save")
	private WebElement saveThirdPartyBtn;

	@FindBy(xpath = "//input[@value='Create draft']")
	private WebElement saveSalesOrderBtn;
	
	public void createSalesOrder() throws Throwable {
		int randomNumber = javaUtility.getRandomNumber();
		CreateSalesOrderPage createSalesOrderPage = new CreateSalesOrderPage(driver);
		createSalesOrderPage.getNewSalesOrderLink().click();
		createSalesOrderPage.getRefCustomer().sendKeys(excelUtility.getDataFromExcel("Comm", 4, 1)+randomNumber);
		createSalesOrderPage.getCreateThirdPartyBtn().click();
		createSalesOrderPage.getThirdPartyName().sendKeys(excelUtility.getDataFromExcel("Comm", 1, 1)+randomNumber);
		createSalesOrderPage.getSaveThirdPartyBtn().click();
		
	}

}
