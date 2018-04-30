Feature: Sell Content

  Scenario: Set cell content with number
    Given Empty spreadsheet
    When I set "a1" content with "1"
    Then The cell "a1" has value "1"

  Scenario: Set cell content with label
    Given Empty spreadsheet
    When I set "a2" content with label "label"
    Then The cell "a2" has value label "label"
