package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.erp.ess.generic.baseutility.BaseClass;

import lombok.Getter;

@Getter
public class HomePage extends BaseClass {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[contains(text(),'admin')]")
	private WebElement adminDrpDwn;

	@FindBy(xpath = "//span[contains(text(),'Logout')]")
	private WebElement logoutBtn;

	@FindBy(id = "mainmenua_companies")
	private WebElement thirdPartiesMajorTab;

	@FindBy(xpath = "//span[text()='Products | Services']")
	private WebElement productsMajorTab;

	@FindBy(xpath = "//span[text()='Commerce']")
	private WebElement commerceMajorTab;

	@FindBy(xpath = "//span[text()='Billing | Payment']")
	private WebElement billingMajorTab;

	@FindBy(xpath = "//span[text()='HRM']")
	private WebElement hrmMajorTab;

	public void navigateToThirParties() {
		thirdPartiesMajorTab.click();
	}
	public void navigateToProducts() {
		productsMajorTab.click();
	}

	public void navigateToCommerce() {
		commerceMajorTab.click();
	}

	public void navigateToBilling() {
		billingMajorTab.click();
	}

	public void navigateToHrm() {
		hrmMajorTab.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(1500);
		adminDrpDwn.click();
		logoutBtn.click();
	}
}
