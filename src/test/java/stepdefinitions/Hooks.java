package stepdefinitions;

import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.ConfigReader;
import utils.UserDetails;

import java.util.List;

import static drivers.DriverManager.*;

public class Hooks {
    ConfigReader configReader = new ConfigReader();

    private static final Logger LOG     = LogManager.getLogger ("Hooks.class");
   // public static WebDriver driver = null;

    @Before(order = 1)
    public void setup() throws Exception {
       /* List<UserDetails> a =configReader.getPeopleList();
        for (UserDetails person : a) {
            LOG.info("Name: " + person.getName() + ", Password: " + person.getPassword());
        }
        UserDetails a = configReader.getUserByRole("test");
        if (a != null) {
            LOG.info("Name: " + a.getName() + ", Password: " + a.getPassword());
        }*/
      //  createDriver(Browser.valueOf("CHROME"));
        createDriver(Browser.valueOf(configReader.getProperty("browser").toUpperCase()));
        //createDriver(Browser.valueOf(System.getProperty("browser").toUpperCase()));
        getDriver().get(configReader.getProperty("url"));
       // getDriver().get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        /*driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");*/
    }

    @Before(order = 2)
    public void test() throws Exception {
        System.out.println("Order here is 2");
    }
    @After
    public void tearDown(Scenario scenario){
        String scenarioName = scenario.getName();
        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot = (TakesScreenshot) getDriver();
            byte[] screenshot = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png",scenarioName);
        }
       quitDriver ();
        //driver.quit();
    }


}
