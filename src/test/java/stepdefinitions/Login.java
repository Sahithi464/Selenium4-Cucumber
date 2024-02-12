package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import pages.LoginPage;

public class Login extends Base {

    LoginPage login = new LoginPage(driver);

    private static Logger LOG     = LogManager.getLogger ("Login.class");


    @Given("User has navigated to the page")
    public void user_navigates_to_login_page() {
        LOG.info("Clicked on Blog link");
        login.clickBlogLink();
    }

    @Given("User enters \"(.*)\" and \"(.*)\"$")
    public void enterUserName(String a,String b) {
        //login.enterText(a,b);
        login.enterUsername();
        login.enterPassword(b);
        login.verify1();

    }

    @Given("Click on Special menu")
    public void clickSpecialLink() {
        String firstName = "Company" + RandomStringUtils.randomAlphabetic(5);
        LOG.info("First name is "+firstName);
        driver.findElement(By.xpath("//div[@id='widget-navbar-217834']/ul/li/a/div/span[contains(text(),'Special')]")).click();
    }
}
