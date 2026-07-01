@createGroup
Feature: create group

  Scenario Outline: create group with valid data
    Given I am on the login page
    And I enter my email <email>
    And I enter my password <password>
    When I click the login button
    Then I should be logged in successfully
    And I click the menu button
    And I select the Admin Panel
    Then I should be on the Admin Dashboard page
    And I click Groups link
    Then I should be on the Manage Groups page
    And I click Create New Group button
    Then Create New Group pop up page should be displayed
    And I enter group name <groupName>
    And I enter group description <description>
    And I enter year
    And I enter max capacity
    And I enter start date
    And I enter end date
    When I click Create Group button
    Then I should see a success message Group created successfully
    And I click back to website button
    Then I should be on Dashboard page
    And I select the Logout option


    Examples:
      | email                    | password   | groupName    | description          |
      | clautildazuma@icloud.com | Summer123! | T luihgtoh 3 | This is a test group |
