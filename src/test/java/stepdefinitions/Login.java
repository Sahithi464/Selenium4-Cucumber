package stepdefinitions;

import hooks.Hooks;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static drivers.DriverManager.getDriver;

public class Login extends Base {
   /* WebDriver driver;

    public Login(){
        this.driver= getDriver();
    }*/



    @Given("User has navigated to login page")
    public void user_navigates_to_login_page() {
        driver.findElement(By.xpath("//div[@id='widget-navbar-217834']/ul/li/a/div/span[contains(text(),'Blog')]")).click();

    }

    @Given("User has logged")
    public void fdfgdfg() {
        driver.findElement(By.xpath("//div[@id='widget-navbar-217834']/ul/li/a/div/span[contains(text(),'Special')]")).click();

    }

}
