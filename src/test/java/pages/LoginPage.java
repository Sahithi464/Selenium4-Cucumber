package pages;

import locators.LoginLocators;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.ElementUtils;

/*public class LoginPage extends BasePage  {
    public  LoginPage( WebDriver driver){
      super(driver);
    }
    public void clickBlogLink(){
        //driver.findElement(Locators.blog_link).click();
        this.elementUtils.doClick(Locators.blog_link);
    }
}*/
public class LoginPage {
     WebDriver driver;
     ElementUtils eleUtil;

     String username="";

     String group;

    ConfigReader configReader = new ConfigReader();

    By loc;
    By loc1;

    public  LoginPage( WebDriver driver){
        this.driver = driver;
        eleUtil = new ElementUtils(this.driver);
    }
    public void clickBlogLink(){
        eleUtil.doClick(LoginLocators.blog_link);
        eleUtil.doClick(LoginLocators.MY_ACCOUNT_LINK);
        Assert.assertTrue("Blog is not displayed",eleUtil.isElementDisplayed(LoginLocators.blog_link));

    }

   /* public void enterText(String a,String b){
        String username = eleUtil.generateRandomAlphanumericString(5);
        String password = eleUtil.generateRandomAlphanumericString(6);
        System.out.println("Username is "+username);
        System.out.println("Password is "+password);
        a = a+"_"+username;
        b=b+password;
        System.out.println("Username is "+a);
        System.out.println("Password is "+b);
        eleUtil.doSendKeys(LoginLocators.LOGIN_EMAIL_INPUT,a);
        eleUtil.doSendKeys(LoginLocators.LOGIN_PASSWORD_INPUT,b);
    }*/

    public void enterUsername(){
         username = "Username_" + eleUtil.generateRandomAlphanumericString(5);
        System.out.println("Username is "+username);
        loc = By.xpath("//td[text()='"+username+"']");
        eleUtil.doSendKeys(LoginLocators.LOGIN_EMAIL_INPUT,username );
        eleUtil.doSendKeys(LoginLocators.LOGIN_EMAIL_INPUT,Keys.ENTER);
    }
    public void enterPassword(String b){
        group =b;
        System.out.println("Password is "+username);
        eleUtil.doSendKeys(LoginLocators.LOGIN_PASSWORD_INPUT,username);
    }
    public void verify1(){
       System.out.println("Locator is "+loc);
       loc1 = By.xpath("//td[text()='"+username+"']/td[text()='"+group+"']");
        System.out.println("Loc1 is "+loc1);
        Assert.assertTrue("dksjkdsf", eleUtil.isElementDisplayed(loc));
    }



}
