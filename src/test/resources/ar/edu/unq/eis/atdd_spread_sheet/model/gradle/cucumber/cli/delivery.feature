Feature: Cell Content

  Scenario: Set cell content with number
    Given Empty spreadsheet from cli
    When I write command set "a1" content with number "1"
    Then The command returns "a1: 1" when cell is "a1"

