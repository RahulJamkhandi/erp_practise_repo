package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.CreateSalesOrderPage;
import com.erp.ess.objectrepository.utility.HomePage;
@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateNewSalesOrderTest extends BaseClass{
	@Test(groups = "regressionTest")
	public void createSalesOrder() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToCommerce();
		CreateSalesOrderPage salesOrderPage = new CreateSalesOrderPage(driver);
		salesOrderPage.createSalesOrder();
	}

}
