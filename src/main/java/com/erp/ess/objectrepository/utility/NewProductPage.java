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
public class NewProductPage {

	WebDriver driver;
	ExcelUtility excelUtility = new ExcelUtility();
	JavaUtility javaUtility = new JavaUtility();

	public NewProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='New product']")
	private WebElement newProductLink;

	@FindBy(id = "ref")
	private WebElement productRefTF;

	@FindBy(name = "label")
	private WebElement productLabelTF;

	@FindBy(id = "select2-statut-container")
	private WebElement sellStatus;

	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	private WebElement sellStatusTF;
	
	@FindBy(xpath = "//span[@aria-labelledby='select2-statut_buy-container']")
	private WebElement purchaseStatus;
	
	@FindBy(xpath = "(//input[@class='select2-search__field'])[2]")
	private WebElement purchaseStatusTF;
	
	@FindBy(xpath = "//input[@value='Create']")
	private WebElement createBtn;

	@FindBy(xpath = "//input[@value='Cancel']")
	private WebElement cancelBtn;
	
	public void createProduct() throws Throwable {
		int randomNumber = javaUtility.getRandomNumber();
		NewProductPage productPage = new NewProductPage(driver);
		productPage.getNewProductLink().click();
		productPage.getProductRefTF().sendKeys(excelUtility.getDataFromExcel("Product", 0, 1)+randomNumber);
		productPage.getProductLabelTF().sendKeys(excelUtility.getDataFromExcel("Product", 1, 1));
		productPage.getSellStatus().click();
		productPage.getSellStatusTF().sendKeys(excelUtility.getDataFromExcel("Product", 2, 1)+Keys.ENTER);
		productPage.getPurchaseStatus().click();
		productPage.getPurchaseStatusTF().sendKeys(excelUtility.getDataFromExcel("Product", 3, 1)+Keys.ENTER);
		productPage.getCreateBtn().click();
	}

}
