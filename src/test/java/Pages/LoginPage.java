package Pages;

import Utilities.WaitUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
    WaitUtil waitUtil;

    @FindBy(xpath = "//h2[@id='login-heading']")
    WebElement loginHeading_xpath;

    @FindBy(id = "login-email")
    WebElement loginEmailField_id;

    @FindBy(id = "login-password")
    WebElement loginPasswordField_id;

    @FindBy(id = "login-submit")
    WebElement loginSubmitButton_id;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.waitUtil = new WaitUtil(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifyLoginPageIsDisplayed() {
        waitUtil.waitForTextToPresentInElement(loginHeading_xpath, "Login to Access Learning Materials");
        if (!loginHeading_xpath.getText().equals("Login to Access Learning Materials")) {
            throw new AssertionError("Expected heading text not found: " + loginHeading_xpath.getText());
        }
    }
    public void enterEmailAddress(String email) {
        loginEmailField_id.sendKeys(email);
    }

    public void enterPassword(String password) {
        loginPasswordField_id.sendKeys(password);
    }

    public void clickSubmitButton() {
        loginSubmitButton_id.click();
    }

}
