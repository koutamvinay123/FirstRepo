Feature: Google Search test

  Scenario: Search for Cucumber BDD
    Given I am on Google homepage
    When I search for "Cucumber BDD"
    Then I should see results related to "Cucumber"
