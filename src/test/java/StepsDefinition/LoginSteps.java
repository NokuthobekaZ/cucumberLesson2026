import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StepsDefinition {

    WebDriver Driver;

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {

    }

    @And("I enter my email (.+)$")
    public void i_enter_my_email(String email) {

    }

    @And("I enter my password (.+)$")
    public void i_enter_my_password(String password) {

    }

    @When("I click the login button")
    public void i_click_the_login_button() {

    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {

    }

}
