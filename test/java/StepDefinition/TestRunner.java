package StepDefinition;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(CucumberOptions.class)
@CucumberOptions(features="src/test/resources/feature/H3.feature")
public class TestRunner {

}
