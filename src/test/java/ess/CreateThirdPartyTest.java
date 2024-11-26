package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.HomePage;
import com.erp.ess.objectrepository.utility.NewThirdPartyPage;
@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateThirdPartyTest extends BaseClass{
	
	
	@Test(groups = "regressionTest")
	public void createThirdParties() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToThirParties();
		NewThirdPartyPage newThirdPartyPage = new NewThirdPartyPage(driver);
		newThirdPartyPage.createNewThirdparty();
	}
}
