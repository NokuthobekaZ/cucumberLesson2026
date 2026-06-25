@createGroup
Feature: create group

  Scenario: create group with valid data
    Given I am on the login page
    And I enter my email <email>
    And I enter my password <password>
    When I click the login button
    Then I should be logged in successfully
    And I click the menu button
    And I select the Admin Panel
    Then I should be on the Admin Dashboard page
    And I click the Groups link
    Then I should be on the Manage Groups page
    And I click the Create New Group button
    Then Create New Group pop up page should be displayed
    And I enter group name <groupName>
    And I enter group description <description>
    And I enter year <year>
    And I enter max capacity <maxCapacity>
    And I enter start date <startDate>
    And I enter end date <endDate>
    When I click "Create Group" button
    Then I should see a success message "Group created successfully"

    Examples:
      | email                    | password     | groupName    | description          | year | maxCapacity | startDate  | endDate    |
      | clautildazuma@icloud.com | Summer123!   | Test Group 1 | This is a test group | 2024 | 10          | 2024-07-01 | 2024-07-31 |
