package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue={"stepdefinitions","hooks"},
        publish=true,
        plugin={"pretty","json:target/cucumber/cucumber.json"})
public class TestRunner {

}
