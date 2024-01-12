package hooks;

import enums.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import utils.ConfigReader;
import utils.UserDetails;

import java.util.List;

import static drivers.DriverManager.*;

public class Hooks {
    ConfigReader configReader = new ConfigReader();

    private static final Logger LOG     = LogManager.getLogger ("Hooks.class");
   // public static WebDriver driver = null;

    @Before
    public void setup() throws Exception {
       /* List<UserDetails> a =configReader.getPeopleList();
        for (UserDetails person : a) {
            LOG.info("Name: " + person.getName() + ", Password: " + person.getPassword());
        }
        UserDetails a = configReader.getUserByRole("test");
        if (a != null) {
            LOG.info("Name: " + a.getName() + ", Password: " + a.getPassword());
        }*/
        createDriver(Browser.valueOf("CHROME"));
        getDriver().get(configReader.getProperty("url"));
       // getDriver().get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
        /*driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");*/
    }
    @After
    public void tearDown(){
        quitDriver ();
        //driver.quit();
    }
   /* public static WebDriver getDriver() {

        return driver;

    }*/

}
