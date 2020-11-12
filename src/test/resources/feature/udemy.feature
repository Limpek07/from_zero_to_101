Feature: Udemy test

  Scenario Outline: Basic search for "<searchTarget>"
    When I navigate to "https://www.udemy.com" url
    And I close the cookie policy overlay
    And I search for "<searchTarget>" courses
    Then I should be redirected to the search results page
    And I should have 20 courses on the page
    And course number <linkCourseIndex> should point to "<linkUrl>" url
    And the title of course number <titleCourseIndex> should be "<title>"
    Examples:
      | searchTarget     | linkCourseIndex | linkUrl                                                                      | titleCourseIndex | title                                                        |
      | selenium         | 1               | https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/ | 2                | Selenium WebDriver Training with Java and Many Live Projects |
      | java programming | 3               | https://www.udemy.com/course/java-in-depth-become-a-complete-java-engineer/  | 4                | Java Programming: Complete Beginner to Advanced              |
