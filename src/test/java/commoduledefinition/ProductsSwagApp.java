package commoduledefinition;

import compageobjectdefinition.LoginSwagAppPageObject;
import compageobjectdefinition.ProductsSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utility.HandlingElementValidation;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class ProductsSwagApp extends ProductsSwagAppPageObject {

	public ProductsSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void verifyDashboardProducts(AppiumDriver driver) {
		HandlingElementValidation.expectedconditionWebElement(driver, LoginSwagAppPageObject.lbl_products, 30);
		assertTrue(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.lbl_products));
		assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>0);
	}

	public static void verifyAddtocart(AppiumDriver driver) {
		if(ProductsSwagAppPageObject.btn_addtocart.size()>0) {
			int randomaddtocart = new Random().nextInt(ProductsSwagAppPageObject.btn_addtocart.size());
			ProductsSwagAppPageObject.btn_addtocart.get(randomaddtocart).click();
		}else {
			assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>0);
		}
	}
	
	public static void verifyMultipleAddtocart(AppiumDriver driver) {
		if(ProductsSwagAppPageObject.btn_addtocart.size()>1) {
			for (int i = 0; i < 3; i++) {
				int randomaddtocart = new Random().nextInt(ProductsSwagAppPageObject.btn_addtocart.size());
				ProductsSwagAppPageObject.btn_addtocart.get(randomaddtocart).click();	
			}
			
		}else {
			assertTrue(ProductsSwagAppPageObject.btn_addtocart.size()>1);
		}
	}
	
	public static void clickCart(AppiumDriver driver) {
		ProductsSwagAppPageObject.btn_cart.click();
	}

}
