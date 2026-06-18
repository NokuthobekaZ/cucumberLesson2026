Feature: login

  Scenario Outline: As a user I want to login to ndosiwebsite
    Given I am on the login page
    And I enter my email <email>
    And I enter my password <password>
    When I click the login button
    Then I should be logged in successfully

    Examples:
      | email                    | password  |
      | clautildazuma@icloud.com | Summer123! |