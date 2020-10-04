package Runner_Package;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},
glue= {"StepDefenition"},
tags = "@Login",
dryRun = false,//to check running to find out if anything is missing
monochrome = true,//to make the console output in a better format
strict = true,// it will check any steps in the feature file is missing in the implementaion
plugin = {"html:testoutput/sunil.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}

)
public class Test_Runner {

}
