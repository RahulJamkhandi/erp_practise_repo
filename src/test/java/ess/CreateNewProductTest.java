package ess;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.erp.ess.generic.baseutility.BaseClass;
import com.erp.ess.objectrepository.utility.HomePage;
import com.erp.ess.objectrepository.utility.NewProductPage;
@Listeners(com.erp.ess.generic.listnerUtility.ListnerImpl.class)
public class CreateNewProductTest extends BaseClass{
	
	@Test(groups = "smokeTest")
	public void createNewProduct() throws Throwable {
		HomePage homePage = new HomePage(driver);
		homePage.navigateToProducts();
		NewProductPage productPage = new NewProductPage(driver);
		productPage.createProduct();
	}

}
