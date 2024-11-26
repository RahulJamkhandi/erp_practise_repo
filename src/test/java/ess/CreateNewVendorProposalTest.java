package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.HomePage;
@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateNewVendorProposalTest extends BaseClass {

	@Test(groups = "regressionTest")
	public void newVendorProposal() {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToCommerce();
	}

}
