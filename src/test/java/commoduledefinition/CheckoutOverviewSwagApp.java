package commoduledefinition;

import compageobjectdefinition.CheckoutOverviewSwagAppPageObject;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utility.HandlingElementValidation;

public class CheckoutOverviewSwagApp extends CheckoutOverviewSwagAppPageObject {

	public CheckoutOverviewSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public static void verifyCheckoutOverview(AppiumDriver driver) {
		if(HandlingElementValidation.ElementPresent(driver, CheckoutOverviewSwagAppPageObject.lbl_checkoutdescription)) {
			WebElement element = (WebElement) driver.findElement(AppiumBy.androidUIAutomator(
			        "new UiScrollable(new UiSelector().scrollable(true))" +
			         ".scrollIntoView(new UiSelector().text(\"FINISH\"))"));
			CheckoutOverviewSwagAppPageObject.btn_finish.click();
			
		}
	}
}
