package basicsFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.loginPageObjects;

public class browsers {
	

	public static WebDriver driver;
	public Properties property;
	public static final String USERNAME = "miratminsk";
	public static final String ACCESS_KEY = "7b85ecc9-60dc-4586-9adf-98b54a97a529";
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	public WebDriver browserInitializer() throws IOException {
		property = new Properties();
		FileInputStream dataFile = new FileInputStream("C:\\Users\\mirat\\git\\AmazonID\\AmazonID\\src\\main\\java\\resources\\Data.properties");
		property.load(dataFile);
		String browserName = property.getProperty("browser");
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\mirat\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\mirat\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browserName.equals("safari"))
		{
			DesiredCapabilities caps = DesiredCapabilities.safari();
			caps.setCapability("platform", "macOS 10.14");
			caps.setCapability("version", "12.0");
			driver = new RemoteWebDriver(new java.net.URL(URL), caps);	
		}
		return driver;
	}
	}
