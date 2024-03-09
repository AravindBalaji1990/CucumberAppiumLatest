package hookdefinitions;

import io.cucumber.java.Before;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class HookIntialisation {
	public static WebDriver driver;
	private static final Logger Log = LogManager.getLogger(HookIntialisation.class);


	@Before
	public void openapp() throws IOException, InterruptedException {
		Log.info("app has been started");
	}

}
