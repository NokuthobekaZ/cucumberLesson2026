package Pages;

import Utilities.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class CreateNewGroupPopUpPage {
    WebDriver driver;
    WaitUtil waitUtil;

    @FindBy(xpath = "//h3[normalize-space()='+ Create New Group']")
    WebElement createNewGroupPopUpPage_xpath;

    @FindBy(xpath = "//input[@placeholder='e.g., 2nd Group 2026']")
    WebElement groupNameField_xpath;

    @FindBy(xpath = "//textarea[@placeholder='Group description...']")
    WebElement groupDescriptionField_xpath;

    @FindBy(xpath = "//input[@name='year']")
    WebElement yearField_xpath;

    @FindBy(xpath = "//input[@placeholder='1']")
    WebElement maxCapacityField_xpath;

    @FindBy(xpath = "//input[@name='startDate']")
    WebElement startDateField_xpath;

    @FindBy(xpath = "//input[@name='endDate']")
    WebElement endDateField_xpath;

    @FindBy(xpath = "//button[normalize-space()='Create Group']")
    WebElement createGroupButton_xpath;


    public CreateNewGroupPopUpPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new WaitUtil(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyCreateNewGroupPopUpPageIsDisplayed() {
        waitUtil.waitForTextToPresentInElement(createNewGroupPopUpPage_xpath, "+ Create New Group");
        if (!createNewGroupPopUpPage_xpath.getText().equals("+ Create New Group")) {
            throw new AssertionError("Expected heading text not found: " + createNewGroupPopUpPage_xpath.getText());
        }
    }

    public void enterGroupName(String groupName) {
        groupNameField_xpath.sendKeys(groupName);
    }

    public void enterGroupDescription(String groupDescription) {
        groupDescriptionField_xpath.sendKeys(groupDescription);
    }

    public void enterYear() {
        int currentYear = LocalDate.now().getYear();
        yearField_xpath.clear();
        yearField_xpath.sendKeys(String.valueOf(currentYear));
    }

    public void enterMaxCapacity() {
        int randomCapacity = new Random().nextInt(50) + 1;
        maxCapacityField_xpath.clear();
        maxCapacityField_xpath.sendKeys(String.valueOf(randomCapacity));
    }

    public void enterStartDate() {
        LocalDate startDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        startDateField_xpath.clear();
        startDateField_xpath.sendKeys(startDate.format(formatter));
    }

    public void enterEndDate() {
        LocalDate endDate = LocalDate.now().plusMonths(6);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        endDateField_xpath.clear();
        endDateField_xpath.sendKeys(endDate.format(formatter));
    }

    public void clickCreateGroupButton() {
        createGroupButton_xpath.click();
    }
}
