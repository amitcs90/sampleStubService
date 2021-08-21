package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/feature" }, glue = { "steps" }, plugin = { "pretty",
		"json:target/cucumber.json" }, monochrome = true, dryRun = true, tags = "@customer")
public class TestRunner { 

}
