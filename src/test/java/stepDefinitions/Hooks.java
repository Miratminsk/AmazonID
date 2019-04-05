package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import basicsFiles.browsers;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks extends browsers{
	
	public static Logger Log = LogManager.getLogger(browsers.class.getName());
	
	@After
    public void the_test_is_completed() throws Throwable {
    	driver.close();
    	driver=null;
    	Log.info("Test is completed");
    }
	
	@After("@RegTest")
	public void getScreenShot(Scenario scenario) throws IOException
	{
		
		if (scenario.isFailed()) {
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenshot, new File("C://Users//mirat//eclipse-workspace//AmazonID//screenshots//screenshots.png" + System.currentTimeMillis()));
    }
	}
}
