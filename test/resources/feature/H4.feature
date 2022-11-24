Feature: working on web application

  Scenario: newtours web page
    Given user is in newtours
    When user needs to enter name and password
    Then user submits the page
    And user closes the window
