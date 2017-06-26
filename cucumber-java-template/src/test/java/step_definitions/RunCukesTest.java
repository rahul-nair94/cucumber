package step_definitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "classpath:features", plugin = { "pretty", "html:target/cucumber-html-report" }, tags = {})
public class RunCukesTest extends AbstractTestNGCucumberTests{
}