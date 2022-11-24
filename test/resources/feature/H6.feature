Feature: working on amazon application

  Scenario: web application
    Given open chrome browser
    When open amazon page
    Then capture all the links and store in excel
    Then capture screenshot
    And close the browser
