package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.HomePage;
import com.erp.ess.objectrepository.utility.NewWareHousePage;
@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateNewWareHouseTest extends BaseClass{
	
	@Test
	public void createNewWareHouse() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToProducts();
		NewWareHousePage wareHousePage = new NewWareHousePage(driver);
		wareHousePage.createWareHouse();
	}

}
