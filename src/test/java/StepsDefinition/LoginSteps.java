package StepsDefinition;

import Base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class LoginSteps extends BaseTest {

    @And("I enter my email (.+)$")
    public void i_enter_my_email(String email) {
        loginPage.enterEmailAddress(email);
    }

    @And("I enter my password (.+)$")
    public void i_enter_my_password(String password) {
        loginPage.enterPassword(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickSubmitButton();
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }

}
