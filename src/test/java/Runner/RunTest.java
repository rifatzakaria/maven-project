package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = { "src/test/resources/MultiCartTest.feature" },
		 glue = { "HomePageTest"},
		tags = { "~@ignore"},
		plugin = {"pretty", "json:target/cucumber-reports/cucumber.json", "html:target/cucumber-reports"}, monochrome=true
		)



public class RunTest {
}


