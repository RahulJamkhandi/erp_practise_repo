package com.erp.ess.objectrepository.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;

@Getter
public class LoginPage {

	WebDriver driver;
	@FindBy(id = "username")
	private WebElement usernameTF;

	@FindBy(id = "password")
	private WebElement passwordTF;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBTN;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApp(String username, String password) throws Exception {
		System.out.println("Hiii:"+username+" "+password);
		Thread.sleep(10);
		usernameTF.sendKeys(username);
		passwordTF.sendKeys(password);
		loginBTN.click();
	}

}
