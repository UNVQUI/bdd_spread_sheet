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

    Given Empty spreadsheet
    When I set "AA1" content with 'Hola UNQUI'
    Then The cell "AA1" has value 'Hola UNQUI'
