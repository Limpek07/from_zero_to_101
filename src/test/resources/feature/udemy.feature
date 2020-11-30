Feature: Udemy test

  Scenario Outline: Basic search for "<searchTarget>"
    When I navigate to <page> page
    And I close the cookie policy overlay
    And I search for "<searchTarget>" courses
    Then I should be redirected to the search results page
    And I should have 20 courses on the page
    And course number <linkCourseIndex> should point to "<urlFragment>"
    And the title of course number <titleCourseIndex> should be "<title>"
    Examples:
      | page                  | searchTarget     | linkCourseIndex | urlFragment                                             | titleCourseIndex | title                                                        |
      | MAIN_PAGE             | java programming | 3               | /course/java-in-depth-become-a-complete-java-engineer/  | 4                | Java Programming: Complete Beginner to Advanced              |
      | BUSINESS_COURSES_PAGE | selenium         | 1               | /course/selenium-real-time-examplesinterview-questions/ | 2                | Selenium WebDriver Training with Java and Many Live Projects |

  Scenario: Opening a course on the search results page
    When I navigate to SEARCH_RESULTS_PAGE page looking for "selenium"
    Then I should be redirected to the search results page
    And I click on course number 19
    Then I should be redirected to the course landing page
