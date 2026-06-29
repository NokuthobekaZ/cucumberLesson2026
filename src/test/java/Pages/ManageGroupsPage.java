package Pages;

import Utilities.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ManageGroupsPage {
    WebDriver driver;
    WaitUtil waitUtil;

    @FindBy(xpath = "//h1[contains(text(),'\uD83D\uDCC1 Manage Groups')]")
    WebElement manageGroupsHeading_xpath;

    @FindBy(xpath = "//button[normalize-space()='+ Create New Group']")
    WebElement createNewGroupButton_xpath;

    @FindBy(xpath = "//div[normalize-space()='Group created successfully!']")
    WebElement groupCreatedSuccessMessage_xpath;

    @FindBy(xpath = "//button[contains(text(),'← Back to Website')]")
    WebElement backToWebsiteButton_xpath;

    public ManageGroupsPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new WaitUtil(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyManageGroupsPageIsDisplayed() {
        waitUtil.waitForTextToPresentInElement(manageGroupsHeading_xpath, "📁 Manage Groups");
        if (!manageGroupsHeading_xpath.getText().equals("📁 Manage Groups")) {
            throw new AssertionError("Expected heading text not found: " + manageGroupsHeading_xpath.getText());
        }
    }

    public void clickCreateNewGroupButton() {
        waitUtil.waitForElementToBeClickable(createNewGroupButton_xpath);
        createNewGroupButton_xpath.click();
    }

    public void verifyGroupCreatedSuccessMessageIsDisplayed() {
        waitUtil.waitForElementToBeVisible(groupCreatedSuccessMessage_xpath);
        if (!groupCreatedSuccessMessage_xpath.isDisplayed()) {
            throw new AssertionError("Group created success message not displayed");
        }
    }

    public void clickBackToWebsiteButton() {
        backToWebsiteButton_xpath.click();
    }

}
