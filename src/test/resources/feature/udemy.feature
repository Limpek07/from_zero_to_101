Feature: Udemy test

  Scenario: Udemy basic checks
    Given I navigated to "https://www.udemy.com/" url
    When I close the cookie policy overlay
    And I search for "selenium" courses
    Then I should be redirected to the results page
    And the first course should point to "https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/" url
    And the title of the second course should be "Selenium WebDriver Training with Java and Many Live Projects"
