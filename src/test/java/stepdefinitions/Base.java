package stepdefinitions;

import org.openqa.selenium.WebDriver;

import static drivers.DriverManager.getDriver;

public class Base {

    WebDriver driver;

    public Base(){
        //super();
        this.driver= getDriver();
    }
}
