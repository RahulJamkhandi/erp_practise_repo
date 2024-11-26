package ess;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;

@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class LoginToApplicationTest extends BaseClass {

	@Test(groups = "smokeTest")
	public void loginToApplication() {
		Reporter.log("Logged in to Application: ", true);
		String title = driver.getTitle();
		Assert.assertEquals(title, "Home - Dolibarr 19.0.1");
	}

}
