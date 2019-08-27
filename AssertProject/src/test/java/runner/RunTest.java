package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src//test//java//feature//asrtT.feature"},
glue= {"stepdefinition"})
public class RunTest {

}
