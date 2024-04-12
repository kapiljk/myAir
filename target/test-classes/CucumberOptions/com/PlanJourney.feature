Feature: To validate the Functionality of PlanMyJourney

  Scenario: Veirfy that the user should be landed in the Plan your itenery page when plan my journey carousel card is clicked
    Given open the My airports app from the mobile device
    When Click on the Login button in splash screen
    And Give the login credentials and click on the Submit button
    And Access the Location
    Then click on Plan my journey card
    And click on ok button on PopUp
    And click back arrow in plamyjourney
    Then close the mobile app
