package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {
	
	public WebDriver driver;
	
	By AccountLists = By.xpath("//span[@class='nav-line-2'][contains(text(),'Account & Lists')]");
	By SignInButton = By.xpath("//div[@class='nav-flyout-content']//span[@class='nav-action-inner'][contains(text(),'Sign in')]");
	By email = By.id("ap_email");
	By password = By.id("ap_password");
	By SignInSubmitButtton = By.id("signInSubmit");
	By HelloUserPresent = By.xpath("//span[contains(text(),'Hello, Mirat')]");
	By ThereWasAProblem = By.xpath("//h4[@class='a-alert-heading']");
	By YourPasswordIsIncorrect = By.xpath("//span[@class='a-list-item']");
	
	
	public loginPageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement getAccountLists()
	{
		return driver.findElement(AccountLists);
	}
	
	public WebElement getSignInButton()
	{
		return driver.findElement(SignInButton);
	}
	
	public WebElement getEmail()
	{
		return driver.findElement(email);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignInSubmitButtton()
	{
		return driver.findElement(SignInSubmitButtton);
	}
	
	public WebElement getHelloUserPresent()
	{
		return driver.findElement(HelloUserPresent);
	}
	
	public WebElement getThereWasAProblem()
	{
		return driver.findElement(ThereWasAProblem);
	}
	
	public WebElement getYourPasswordIsIncorrect()
	{
		return driver.findElement(YourPasswordIsIncorrect);
	}

}
