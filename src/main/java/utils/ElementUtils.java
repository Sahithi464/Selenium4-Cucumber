package utils;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Collections;
import java.util.List;

public class ElementUtils {
     private WebDriver driver;

    private static final Logger LOG     = LogManager.getLogger ("ElementUtils.class");


    public ElementUtils(WebDriver driver) {
        this.driver = driver;
    }


    /**
    * Used to click an element
    * @param locator By Element locator
     */
    public void doClick(By locator) {
        try {
            driver.findElement(locator).click();
        }
        catch (Exception e){
            LOG.error("Unable to click element: "+e.getMessage());
        }
    }

    /**
     * @param locator By Element locator
     * @param value Text to be entered
     */
    public void doSendKeys(By locator, String value) {
        try {
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(value);
        }
        catch (Exception e){
            LOG.error("Unable to enter text in: "+locator);
        }
    }

    public void doSendKeys(By locator, Keys keys) {
        try {
            driver.findElement(locator).sendKeys(keys);
        } catch (Exception e) {
            LOG.error("Unable to send keys in: " + locator);
        }
    }

    /**
     * @param locator By Element locator
     */
    public void elementGetText(By locator) {
        try {
            driver.findElement(locator).getText();
           // Assert.assertEquals();
        }
        catch (Exception e){
            LOG.error("Unable to get text: "+locator);
        }
    }

    public List<WebElement> getElements(By locator) {
        try {
            return driver.findElements(locator);
        }
        catch (Exception e){
            LOG.error("Unable to get elements: "+locator);
            return Collections.emptyList();
        }
    }

    /**
     * @param locator By Element locator
     *  Check for element is displayed
     */
    public boolean isElementDisplayed(By locator) {
        return driver.findElement(locator).isDisplayed();
    }

    public String generateRandomAlphanumericString(int length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        // Use RandomStringUtils from Apache Commons Lang
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public void doSelectDropDownByIndex(By locator, int index) {
        try {
            Select select = new Select(driver.findElement(locator));
            select.selectByIndex(index);
        }
        catch (Exception e){
            LOG.error("Unable to select dropdown by index: "+locator);
        }
    }

    public void doSelectDropDownByVisibleText(By locator, String visibleText) {
        try {
            Select select = new Select(driver.findElement(locator));
            select.selectByVisibleText(visibleText);
        }
        catch (Exception e){
            LOG.error("Unable to select dropdown by visibleText: "+locator);
        }
    }

    public void doSelectDropDownByValue(By locator, String value) {
        try {
            Select select = new Select(driver.findElement(locator));
            select.selectByValue(value);
        }
        catch (Exception e){
            LOG.error("Unable to select dropdown by value: "+locator);
        }
    }

    /**
     * @param locator By Element locator
     * @param timeOut
     *  Checking an element is present on the DOM of the page and visible
     */
    public void waitForVisibilityOfElement(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        }
        catch (Exception e){
            LOG.error("Element is not visible "+locator);
        }
    }

    /**
     * @param locator By Element locator
     * @param timeOut
     *  Checking an element is present on the DOM of the page
     */
    public void waitForPresenceOfElement(By locator, int timeOut) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        } catch (Exception e){
            LOG.error("Element is not present "+locator);
        }

    }

    /**
     * @param locator By Element locator
     * @param timeOut
     *  Checking an element is visible and enabled for click
     */
    public void waitForElementToBeClickable(By locator, int timeOut) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
            wait.until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e){
            LOG.error("Element is not clickable "+locator);
        }
    }


}
