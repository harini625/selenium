Feature: working on amazon page

  Scenario Outline: Dexlearn.com
    Given user is in dezlearn.com
    When user gets the url and title
    Then user works on alert
    And user captures screenshot and close the window
