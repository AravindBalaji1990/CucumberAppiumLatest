package commoduledefinition;

import compageobjectdefinition.LoginSwagAppPageObject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import utility.HandlingElementValidation;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class LoginSwagApp extends LoginSwagAppPageObject {

	public LoginSwagApp(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static void verifyLogin(AppiumDriver driver) {
		assertTrue(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.btn_login));
	}
	
	public static void enterUsername(AppiumDriver driver, String username) {
		if(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.txt_username)) {
			HandlingElementValidation.TypeElement(driver, LoginSwagAppPageObject.txt_username, username);
		}
	}
	
	public static void enterPassword(AppiumDriver driver, String password) {
		if(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.txt_password)) {
			HandlingElementValidation.TypeElement(driver, LoginSwagAppPageObject.txt_password, password);
		}
	}
	
	public static void clickLogin(AppiumDriver driver) {
		if (HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.btn_login)) {
			LoginSwagAppPageObject.btn_login.click();
		}
	}
	
	public static void validateError(AppiumDriver driver,String error) {
		if(HandlingElementValidation.ElementPresent(driver, LoginSwagAppPageObject.err_message)) {
			assertEquals(LoginSwagAppPageObject.err_message.getText().trim(), error.trim());
		}
		
	}
}
