package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtil {

    private static final int DEFAULT_WAIT_TIME = 30;
    private WebDriver driver;
    private WebDriverWait wait;

    public WaitUtil(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_WAIT_TIME));
    }

    public WaitUtil(WebDriver driver, int waitTime) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(waitTime));
    }

    // Wait for element to be visible
    public WebElement waitForElementToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Wait for element to be visible
    public WebElement waitForElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Wait for element to be clickable
    public WebElement waitForElementToBeClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for element to be clickable
    public WebElement waitForElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    // Wait for element to be present in DOM
    public WebElement waitForElementToBePresent(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    // Wait for element to be invisible
    public boolean waitForElementToBeInvisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    // Wait for element to be invisible
    public boolean waitForElementToBeInvisible(WebElement element) {
        return wait.until(ExpectedConditions.invisibilityOf(element));
    }

    // Wait for number of elements to be greater than or equal to count
    public java.util.List<WebElement> waitForNumberOfElements(By locator, int count) {
        return wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(locator, count - 1));
    }

    // Wait for text to be present in element
    public boolean waitForTextToPresentInElement(WebElement element, String text) {
        return wait.until(ExpectedConditions.textToBePresentInElement(element, text));
    }

    // Wait for text to be present in element by locator
    public boolean waitForTextToPresentInElement(By locator, String text) {
        return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
    }

    // Wait for URL to contain a specific string
    public boolean waitForUrlContains(String urlPortion) {
        return wait.until(ExpectedConditions.urlContains(urlPortion));
    }

    // Wait for title to contain a specific string
    public boolean waitForTitleContains(String titlePortion) {
        return wait.until(ExpectedConditions.titleContains(titlePortion));
    }

    // Wait for title to be exact
    public boolean waitForTitleToBe(String title) {
        return wait.until(ExpectedConditions.titleIs(title));
    }

    // Custom wait with custom timeout
    public WebElement waitForElementToBeVisibleCustom(By locator, int timeoutInSeconds) {
        WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return customWait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    // Custom wait with custom timeout for clickable element
    public WebElement waitForElementToBeClickableCustom(By locator, int timeoutInSeconds) {
        WebDriverWait customWait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return customWait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    // Wait for all elements of a locator to be visible
    public java.util.List<WebElement> waitForAllElementsToBeVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    // Implicit wait (global wait for all driver operations)
    public void setImplicitWait(int timeoutInSeconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutInSeconds));
    }

    // Page load timeout
    public void setPageLoadTimeout(int timeoutInSeconds) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeoutInSeconds));
    }

    // Script timeout (JavaScript execution timeout)
    public void setScriptTimeout(int timeoutInSeconds) {
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(timeoutInSeconds));
    }
}
