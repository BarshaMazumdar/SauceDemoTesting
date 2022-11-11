package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;

public class testRun {
	@CucumberOptions(features = "Features", glue = "stepDefinition", plugin = { "pretty",
			"html:target/htmlReport/cucumber-reports.html",
			"json:target/jsonReport/cucumber-reports.json" }, monochrome = true)
	public class TestRunner extends AbstractTestNGCucumberTests {
		TestNGCucumberRunner testrunner = new TestNGCucumberRunner(this.getClass());
	}
}
