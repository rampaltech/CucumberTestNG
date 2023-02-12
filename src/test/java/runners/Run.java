package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue={"stepDefinitions"}
)
public class Run extends AbstractTestNGCucumberTests {
}

