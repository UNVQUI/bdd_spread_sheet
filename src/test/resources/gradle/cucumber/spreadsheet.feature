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

    Given Empty spreadsheet
    When I set "aa1" content with 'hola'
    Then The cell "aa1" has value 'hola'

  Scenario: Set cell content with addition of numbers

    Given Empty spreadsheet
    When I set "a9" content with "9"
    And I set "a8" content with "0"
    And I set "a2" using a formula "=suma(a9,a8)"
    Then The cell "a2" has value "9"

    Given Empty spreadsheet
    When I set "a9" content with "45"
    And I set "a8" content with "0"
    And I set "a2" using a formula "=suma(a9,a8)"
    Then The cell "a2" has value "45"
