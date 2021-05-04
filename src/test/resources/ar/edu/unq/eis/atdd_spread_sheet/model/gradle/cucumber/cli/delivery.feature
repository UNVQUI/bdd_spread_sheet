Feature: Cell Content

  Scenario: Set cell content with number
    Given Empty spreadsheet from cli
    When I write command set number "cli setnumber a1 1 from unknown"
    Then I read value with command "cli getnumber a1 from unknown" and the value is "1"