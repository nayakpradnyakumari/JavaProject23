package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features=".//src//test//resources//featurefiles//Login_Actitime03.feature",
glue={"cucumber"},                 // where ur feature files, file is present put that package name, u can even put two three pacakge by giving comma in glue and features
//tags="@Regression",
monochrome=true)

public class TestRun {

}


