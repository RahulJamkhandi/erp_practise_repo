package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.ess.generic.fileutility.ExcelUtility;
import com.erp.ess.generic.webdriverutility.JavaUtility;

import lombok.Getter;

@Getter
public class NewContactPage {

	WebDriver driver;
	ExcelUtility excelUtility = new ExcelUtility();
	JavaUtility javaUtility = new JavaUtility();

	public NewContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'New Contact/Address')]")
	private WebElement newContactLink;

	@FindBy(id = "lastname")
	private WebElement lastName_LabelTF;

	@FindBy(id = "firstname")
	private WebElement firstNameTF;

	@FindBy(xpath = "//span[text()='Select a third party']")
	private WebElement selectTP;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	private WebElement selectText;

	@FindBy(xpath = "//input[@value='Add']")
	private WebElement addBtn;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement cancelBtn;

	public void createContact() throws Throwable {
		int randomNumber = javaUtility.getRandomNumber();
		
		NewContactPage contactPage = new NewContactPage(driver);
		contactPage.getNewContactLink().click();
		contactPage.getLastName_LabelTF().sendKeys(excelUtility.getDataFromExcel("Contact", 1, 1)+randomNumber);
		contactPage.getFirstNameTF().sendKeys(excelUtility.getDataFromExcel("Contact", 2, 1));
		contactPage.getAddBtn().click();
	}

}
