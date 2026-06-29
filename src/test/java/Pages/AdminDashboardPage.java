package Pages;

import Utilities.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminDashboardPage {
    WebDriver driver;
    WaitUtil waitUtil;

    @FindBy(xpath = "//h1[contains(text(),'\uD83D\uDD10 Admin Dashboard')]")
    WebElement adminDashboardHeading_xpath;

    @FindBy(xpath = "//button[4]")
    WebElement groupsButton_xpath;


    public AdminDashboardPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new WaitUtil(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyAdminDashboardPageIsDisplayed() {
        waitUtil.waitForTextToPresentInElement(adminDashboardHeading_xpath, "🔐 Admin Dashboard");
        if (!adminDashboardHeading_xpath.getText().equals("🔐 Admin Dashboard")) {
            throw new AssertionError("Expected heading text not found: " + adminDashboardHeading_xpath.getText());
        }
    }

    public void clickGroupsButton(){
        waitUtil.waitForElementToBeClickable(groupsButton_xpath);
        groupsButton_xpath.click();
    }
}
