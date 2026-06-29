package StepsDefinition;

import Base.BaseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateNewGroupPopUpSteps extends BaseTest {

    @Then("Create New Group pop up page should be displayed")
    public void create_new_group_pop_up_page_should_be_displayed() {
        createNewGroupPopUpPage.verifyCreateNewGroupPopUpPageIsDisplayed();

    }

    @And("I enter group name (.+)$")
    public void iEnterGroupNameGroupName(String groupName) {
        createNewGroupPopUpPage.enterGroupName(groupName);
    }

    @And("I enter group description (.+)$")
    public void iEnterGroupDescriptionDescription(String description) {
        createNewGroupPopUpPage.enterGroupDescription(description);
    }

    @And("I enter year")
    public void iEnterYear() {
        createNewGroupPopUpPage.enterYear();
    }

    @And("I enter max capacity")
    public void iEnterMaxCapacityMaxCapacity() {
        createNewGroupPopUpPage.enterMaxCapacity();
    }

    @And("I enter start date")
    public void iEnterStartDateStartDate() {
        createNewGroupPopUpPage.enterStartDate();
    }

    @And("I enter end date")
    public void iEnterEndDateEndDate() {
        createNewGroupPopUpPage.enterEndDate();
    }

    @When("I click Create Group button")
    public void iClickCreateGroupButton() {
        createNewGroupPopUpPage.clickCreateGroupButton();
    }
}
