package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.runner.RunWith;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import basicsFiles.browsers;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import pageObjects.loginPageObjects;

@RunWith(Cucumber.class)
public class StepDefinition extends browsers{
	public static Logger Log = LogManager.getLogger(browsers.class.getName());
	
	@Given("^Initialize WebDriver$")
    public void initialize_webdriver() throws Throwable {
        driver = browserInitializer();
        Log.info("Driver is initialized");
    }

	@When("^Open webpage and go to sign in page$")
    public void open_webpage_and_go_to_sign_in_page() throws Throwable {
		driver.get(rs.getString("URL"));
    	//driver.get(property.getProperty("URL"));
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        loginPageObjects loginPageObjects = new loginPageObjects(driver);
        wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.getAccountLists()));
        Actions actions = new Actions(driver);
        actions.moveToElement(loginPageObjects.getAccountLists()).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.getSignInButton()));
        loginPageObjects.getSignInButton().click();
        Log.info("User on sigh in page");
    }

    @Then("^User login with valid username and password$")
    public void user_login_with_valid_username_and_password() throws Throwable {
    	loginPageObjects loginPageObjects = new loginPageObjects(driver);
    	loginPageObjects.getEmail().sendKeys(property.getProperty("email"));
    	loginPageObjects.getPassword().sendKeys(property.getProperty("password"));
    	loginPageObjects.getSignInSubmitButtton().click();
    	Log.info("User put valid email and password");
    }

    @Then("^User is on main page and account is active$")
    public void user_is_on_main_page_and_account_is_active() throws Throwable {
    	loginPageObjects loginPageObjects = new loginPageObjects(driver);
    	loginPageObjects.getHelloUserPresent().isDisplayed();
    	Log.info("Login with valid credentials");
    }
    
    @Then("^User login with valid username and unvalid password$")
    public void user_login_with_valid_username_and_unvalid_password() throws Throwable {
    	loginPageObjects loginPageObjects = new loginPageObjects(driver);
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.elementToBeClickable(loginPageObjects.getEmail()));
    	loginPageObjects.getEmail().sendKeys(rs.getString("Username"));
    	//loginPageObjects.getEmail().sendKeys(property.getProperty("email"));
    	loginPageObjects.getPassword().sendKeys(rs.getString("Passwords"));
    	//loginPageObjects.getPassword().sendKeys(property.getProperty("unValidPassword"));
    	loginPageObjects.getSignInSubmitButtton().click();
    	Log.info("User put valid email and unvalid password");
    }

    @Then("^Unvalid password error is displayed$")
    public void unvalid_password_error_is_displayed() throws Throwable {
    	loginPageObjects loginPageObjects = new loginPageObjects(driver);
    	loginPageObjects.getThereWasAProblem().isDisplayed();
    	loginPageObjects.getYourPasswordIsIncorrect().isDisplayed();
    	Log.info("Login with valid username and unvalid password");
    }   
    
    @Then("^Validate SignIn button is present$")
    public void validate_signin_button_is_present() throws Throwable {
    	loginPageObjects loginPageObjects = new loginPageObjects(driver);
    	loginPageObjects.getSignInSubmitButtton().isDisplayed();
    	
    }

   
    }
