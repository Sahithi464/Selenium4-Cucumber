/*package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import java.io.File;
import java.io.IOException;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;
import net.masterthought.cucumber.presentation.PresentationMode;
import net.masterthought.cucumber.json.support.Status;
import java.util.*;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
        glue={"stepdefinitions","hooks"},
        publish=true,
        //dryRun = true,
      //  tags = "@Smoke",
        //snippets = CAMELCASE,
        plugin={"pretty","json:target/cucumber/cucumber-report.json"})
public class TestRunner  {


    @AfterClass
    public static void reportSetup() throws IOException {

        File reportOutputDirectory = new File("target");
        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add("target\\cucumber\\cucumber-report.json");
        // jsonFiles.add("cucumber-report-2.json");

        String buildNumber = "1";
        String projectName = "Test Project";

        Configuration configuration = new Configuration(reportOutputDirectory, projectName);
        configuration.setBuildNumber(buildNumber);
        // optional configuration - check javadoc for details
        configuration.addPresentationModes(PresentationMode.RUN_WITH_JENKINS);
        // do not make scenario failed when step has status SKIPPED
        configuration.setNotFailingStatuses(Collections.singleton(Status.SKIPPED));
        configuration.setBuildNumber(buildNumber);
        // addidtional metadata presented on main page
        configuration.addClassifications("Platform", "Windows");
        configuration.addClassifications("Browser", "Firefox");
        configuration.addClassifications("Branch", "release/1.0");
        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
         reportBuilder.generateReports();

    }

}*/




