package commoduledefinition;

import compageobjectdefinition.CheckoutInfoSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utility.HandlingElementValidation;

import java.io.IOException;

public class CheckoutInfoSwagApp extends CheckoutInfoSwagAppPageObject {

	public CheckoutInfoSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void verifyCheckoutInfo(AppiumDriver driver) throws IOException {
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_firstname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_firstname,
					HandlingElementValidation.getDataFromProperties().getProperty("firstname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_lastname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_lastname,
					HandlingElementValidation.getDataFromProperties().getProperty("lastname"));
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_postalcode)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_postalcode,
					HandlingElementValidation.getDataFromProperties().getProperty("postalcode"));
		}

		CheckoutInfoSwagAppPageObject.btn_continue.click();
	}
	
	public static void verifyCheckoutInfoEmpty(AppiumDriver driver) throws IOException {
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_firstname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_firstname,"");
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_lastname)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_lastname,"");
		}
		if (HandlingElementValidation.ElementPresent(driver, CheckoutInfoSwagAppPageObject.txt_postalcode)) {
			HandlingElementValidation.TypeElement(driver, CheckoutInfoSwagAppPageObject.txt_postalcode,"");
		}

		CheckoutInfoSwagAppPageObject.btn_continue.click();
	}

}
