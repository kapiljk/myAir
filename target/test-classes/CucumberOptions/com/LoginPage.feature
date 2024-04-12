Feature: Validate the Functionality of login page

  Scenario: Verify that user should be landed on the home page
    Given open the My airports app from the mobile device
    When Click on the Login button in splash screen
    And Give the login credentials and click on the Submit button
    And Access the Location
    Then close the mobile app
