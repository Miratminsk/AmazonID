package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mainPageObjects {
	
	public WebDriver driver;
	
	By searchField = By.id("twotabsearchtextbox");
	By searchButton = By.id("nav-search-submit-text");
	By suggestions = By.id("issDiv4"); 
	
	
	public mainPageObjects(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public WebElement getsearchField()
	{
		return driver.findElement(searchField);
	}

	public WebElement getsearchButton()
	{
		return driver.findElement(searchButton);
	}
	
	public WebElement getSuggestions()
	{
		return driver.findElement(suggestions);
	}

}
