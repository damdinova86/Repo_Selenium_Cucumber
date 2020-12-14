Feature: Search
# Homework 15

  Scenario: Verify  user selection from autosuggestion appears on Search page
#    Given I am on hotels landing page
    When I enter 'york' in search
     And I select 'Lake George, New York, United States of America' from autosuggestion
     And I click Search button
    Then I verify search header contains text selected  from  autosuggestion
      And I verify text under 'Destination, property, or landmark' is same  as text selected
