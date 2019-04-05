package basicsFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browsers {
	

	public static WebDriver driver;
	public Properties property;
	public WebDriver browserInitializer() throws IOException {
		property = new Properties();
		FileInputStream dataFile = new FileInputStream("C:\\Users\\mirat\\eclipse-workspace\\AmazonID\\src\\main\\java\\resources\\Data.properties");
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
		return driver;
	}
	}
