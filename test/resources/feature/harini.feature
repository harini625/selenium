Feature: working on login window

  Scenario: newtours application
    Given user is in newtours application
    When user needs to enter username and pass
    Then user is navigated to search window
    And user navigated to homepage
