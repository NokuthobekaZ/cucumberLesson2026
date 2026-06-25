package Pages;

import Utilities.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
    WebDriver driver;
    WaitUtil waitUtil;

    @FindBy(xpath = "//span[normalize-space()='back,']")
    WebElement welcomeMessage_xpath;

    @FindBy(xpath = "//button[@class='user-pill open']//span[contains(text(),'▼')]")
    WebElement menuButton_xpath;

    @FindBy(xpath = "//button[@class='nav-dropdown-item']//span[contains(text(),'Admin Panel')]")
    WebElement adminPanel_xpath;


    public DashboardPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new WaitUtil(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyDashboardPageIsDisplayed() {
        waitUtil.waitForElementToBeVisible(welcomeMessage_xpath);
        if (!welcomeMessage_xpath.isDisplayed()) {
            throw new AssertionError("Welcome page element not displayed");
        }
        String welcomeText = welcomeMessage_xpath.getText();
        if (welcomeText.trim().isEmpty()) {
            throw new AssertionError("Welcome message text is empty");
        }
    }

    public void clickMenuButton() {
        menuButton_xpath.click();
    }

    public void clickAdminPanel() {
        adminPanel_xpath.click();
    }
}
