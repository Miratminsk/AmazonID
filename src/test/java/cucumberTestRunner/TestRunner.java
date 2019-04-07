package cucumberTestRunner;

import org.junit.runner.RunWith;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
 glue = {"stepDefinitions"}, tags = {"@Cloud"},
 plugin = {"pretty", "html:target/cucumber", "json:target/cucumber.json", "junit:target/cukes.xml"})

public class TestRunner extends AbstractTestNGCucumberTests{
	
}


