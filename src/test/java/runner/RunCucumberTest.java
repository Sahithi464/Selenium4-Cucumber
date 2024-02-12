package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features="src/test/resources/features",
        glue={"stepdefinitions"},
        publish=true,
        //dryRun = true,
         // tags = "@test",
        //snippets = CAMELCASE,
        plugin={"pretty","json:target/cucumber/cucumber.json"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }


}
