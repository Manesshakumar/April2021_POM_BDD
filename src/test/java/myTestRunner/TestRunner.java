package myTestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/appFeatures/account.feature"},
		glue = {"stepDefinitions", "appHooks"},
		monochrome = true,
		plugin = {"pretty" ,
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		publish = true
		)

public class TestRunner {

}
