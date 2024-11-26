package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.HomePage;
import com.erp.ess.objectrepository.utility.NewContactPage;

@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateNewContactTest extends BaseClass {

	@Test(groups = "regressionTest")
	public void createNewContact() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToThirParties();
		NewContactPage contactPage = new NewContactPage(driver);
		contactPage.createContact();
	}

}
