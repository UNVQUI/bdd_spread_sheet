Feature: Cell Content

  Scenario: Set cell content with number
    Given Empty spreadsheet
    When I set "a1" content with "1"
    Then The cell "a1" has value "1"

    Given Empty spreadsheet
    When I set "a1" content with "2"
    Then The cell "a1" has value "2"

    Given Empty spreadsheet
    When I set "a9" content with "9"
    Then The cell "a9" has value "9"

    Given Empty spreadsheet
    When I set "aa1" content with 'hola'
    Then The cell "aa1" has value 'hola'

  Scenario: Set cell content with suma formula #2
    Given Empty spreadsheet
    When I set "a9" content with "1"
    And I set "a1" content with "2"
    And I set "b1" using a formula "=suma(a9,a1)"
    Then The cell "b1" has value "3"