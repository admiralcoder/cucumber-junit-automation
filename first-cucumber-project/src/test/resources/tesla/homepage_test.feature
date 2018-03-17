Feature: Tesla home page

  # <- this is a comment leave your notes here.. using #
  Scenario: Model S link
    Given I am on the home page
    When I click on the model S link
    Then Model S homepage should be displayed

  Scenario: Roadster link
    Given I am on the home page
    When I click on Roadster link
    Then Roadster home page should be displayed
    # if any step in the scenario fails, 
