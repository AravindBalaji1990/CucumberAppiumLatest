package basedriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class AndroidBaseClass {
	public static AppiumDriver driver;
	
	public AndroidBaseClass(AppiumDriver driver2){
		this.driver = driver2;
		loadElements();
	}

	public void loadElements(){
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
}
