package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.ess.generic.fileutility.ExcelUtility;
import com.erp.ess.generic.webdriverutility.JavaUtility;

import lombok.Getter;

@Getter
public class NewWareHousePage {

	WebDriver driver;
	ExcelUtility excelUtility = new ExcelUtility();
	JavaUtility javaUtility = new JavaUtility();

	public NewWareHousePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='New warehouse']")
	private WebElement newWarehouseLink;

	@FindBy(xpath = "//input[@name='libelle']")
	private WebElement wareHouseRef;

	@FindBy(xpath = "//input[@value='Create']")
	private WebElement createBtn;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement cancelBtn;

	public void createWareHouse() throws Throwable {
		int randomNumber = javaUtility.getRandomNumber();

		NewWareHousePage housePage = new NewWareHousePage(driver);
		housePage.getNewWarehouseLink().click();
		housePage.getWareHouseRef().sendKeys(excelUtility.getDataFromExcel("Ware", 0, 1) + randomNumber);
		housePage.getCreateBtn().click();
	}

}
