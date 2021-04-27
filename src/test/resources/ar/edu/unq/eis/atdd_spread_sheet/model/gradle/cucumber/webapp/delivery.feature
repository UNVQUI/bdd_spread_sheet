Feature: Cell Content

  Scenario: Set cell content with number on web
    Given Empty spreadsheet from web
    When I fill the input-text for the cell "a1" with "1"
    Then The div for the cell "a1" has value "1"

