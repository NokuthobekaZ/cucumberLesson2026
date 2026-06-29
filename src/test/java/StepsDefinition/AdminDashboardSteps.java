package StepsDefinition;

import Base.BaseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AdminDashboardSteps extends BaseTest {
    @Then("I should be on the Admin Dashboard page")
    public void i_should_be_on_the_admin_dashboard_page() {
        adminDashboardPage.verifyAdminDashboardPageIsDisplayed();

    }

    @And("I click Groups link")
    public void iClickGroupsLink() {
        adminDashboardPage.clickGroupsButton();
    }


}
