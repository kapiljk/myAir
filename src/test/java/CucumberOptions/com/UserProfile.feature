Feature: Validate the Functionality of the User Profile Module

  Scenario: Verify User Profile Module
    Given open the My airports app from the mobile device
    When Click on the Login button in splash screen
    And Give the login credentials and click on the Submit button
    And Access the Location
    Then Click on the User profile Icon in the home screen
    Then Click on the Back arrow in the My profile page and verify the Back flow
    Then Click on the User profile Icon in the home screen
    Then Click on the logout button in the My profile page
    And Click on I do not want to logout button in the pop up
    Then Verify the Navigation from logout pop up page to My profile page
    Then Click on the logout button in the My profile page
    And Click on back arrow button in the pop up page
    Then Verify the Navigation from logout pop up page to My profile page
    Then close the mobile app
