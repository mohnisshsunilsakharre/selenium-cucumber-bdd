Feature: OrangeHRM Login

  Scenario: Valid Login

    Given User launches OrangeHRM login page
    When User enters valid username and password
    And User clicks login button
    Then User should be navigated to dashboard