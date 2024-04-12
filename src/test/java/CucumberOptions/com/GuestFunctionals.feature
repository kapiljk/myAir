Feature: Validate the Guest button functionality in the splash screen

  Scenario: Verify that user should be landed in the home screen when guest button is clicked
    Given open the My airports app from the mobile device
    When Click on the Guest button in splash screen
    And Access the Location
    Then Click on the special assistance button in the home screen
    Then Click on the Back arrow on special assistance page and verify the Functionality of the Back arrow
    Then Click on the special assistance button in the home screen
    Then Verify the Presence of Travelling with childern service along with Icon in the SA landing page
    Then Verify the Presence of Assistance for a person with redued mobility and hidden dsiabilities service along with Icon in the SA landing page
    Then Verify the Presence of Others service along with Icon in the SA landing page
    Then Verify that user should be navigated to the services details page when clicked on any perticular service
    Then Verify that Services should be changed accordingly when terminal name is changed in the drop down in the services details page
    And click on menu button in the Home screen
    And Click on the special assistance button in the menu
    Then Click on the Back arrow on special assistance page and verify the Functionality of the Back arrow
    Then close the mobile app
