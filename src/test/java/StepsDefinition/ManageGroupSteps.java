package StepsDefinition;

import Base.BaseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageGroupSteps extends BaseTest {

    @Then("I should be on the Manage Groups page")
    public void i_should_be_on_the_manage_groups_page() {
        manageGroupsPage.verifyManageGroupsPageIsDisplayed();
    }

    @And("I click Create New Group button")
    public void iClickCreateNewGroupButton() {
        manageGroupsPage.clickCreateNewGroupButton();
    }


    @Then("I should see a success message Group created successfully")
    public void iShouldSeeASuccessMessageGroupCreatedSuccessfully() {
        manageGroupsPage.verifyGroupCreatedSuccessfully();
    }

    @And("I click back to website button")
    public void iClickBackToWebsiteButton() {
       manageGroupsPage.clickBackToWebsiteButton();
    }
}
