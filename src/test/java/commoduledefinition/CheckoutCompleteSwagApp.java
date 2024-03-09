package commoduledefinition;

import compageobjectdefinition.CheckoutCompleteSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertTrue;

public class CheckoutCompleteSwagApp extends CheckoutCompleteSwagAppPageObject {

	public CheckoutCompleteSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void validateCheckoutComplete(AppiumDriver driver) {
		assertTrue(CheckoutCompleteSwagAppPageObject.lbl_checkoutcomplete.getText().contains("COMPLETE"));
	}
}
