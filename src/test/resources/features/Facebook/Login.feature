Feature: Login

  Scenario: User gets error on invalid credentials
    Given I am on landing page
    When I am enter 'abd@gmail.com' in username
    And I enter "wrongemail"
    Then I see the error message
# Then I am on home screen - this this a comment
