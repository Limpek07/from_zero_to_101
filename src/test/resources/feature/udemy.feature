Feature: Udemy test

  Scenario: Basic search test
    When I navigate to "https://www.udemy.com" url
    And I close the cookie policy overlay
    And I search for "selenium" courses
    Then I should be redirected to the search results page
    And I should have 20 courses on the page
    And course number 1 should point to "https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/" url
    And the title of course number 2 should be "Selenium WebDriver Training with Java and Many Live Projects"
    And I close the browser

  Scenario: Basic search test 2
    When I navigate to "https://www.udemy.com" url
    And I close the cookie policy overlay
    And I search for "java programming" courses
    Then I should be redirected to the search results page
    And I should have 20 courses on the page
    And course number 1 should point to "https://www.udemy.com/course/java-the-complete-java-developer-course/" url
    And the title of course number 2 should be "Java Programming for Complete Beginners"
    And I close the browser
