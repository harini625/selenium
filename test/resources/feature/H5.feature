Feature: webapplication

  Scenario: working on newtours application
    Given user open new tours page
    When user need to click register link
    Then user need to get country name from drop down
    And user navigate back to the home back
    And user close the browser
