package StepsDefinition;

import Base.BaseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class DashboardSteps extends BaseTest {

    @And("I click the menu button")
    public void iClickTheMenuButton() {
        dashboardPage.clickMenuButton();
    }

    @And("I select the Admin Panel")
    public void iSelectTheAdminPanel() {
        dashboardPage.clickAdminPanel();
    }

    @Then("I should be on Dashboard page")
    public void iShouldBeOnDashboardPage() {
        dashboardPage.verifyDashboardPageIsDisplayed();
    }

    @And("I select the Logout option")
    public void iSelectTheLogoutOption() {
        dashboardPage.clickMenuButton();
        dashboardPage.clickLogoutButton();
        dashboardPage.confirmLogout();
    }

}
