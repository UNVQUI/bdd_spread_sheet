Feature: Changing Cell Content

  Scenario: Numeric Content
    Given Empty spreadsheet
    When I set "a1" content with "1"
    Then The cell "a1" has value "1"

  Scenario: Text context
    Given Empty spreadsheet
    When I set "a2" content with label "label"
    Then The cell "a2" has value label "label"

  Scenario: Identity Formula with numbers
    Given Empty spreadsheet
    When I set "a1" content with "1"
    And I set "a2" content with formula "=id(a1)"
    Then The cell "a2" has value "1"

  Scenario: Identity Formula with numbers #2
    Given Empty spreadsheet
    When I set "a1" content with "89"
    And I set "a2" content with formula "=id(a1)"
    Then The cell "a2" has value "89"

  Scenario: Identity Formula with labels
    Given Empty spreadsheet
    When I set "a1" content with label "labelIdentity"
    And I set "a2" content with formula "=id(a1)"
    Then The cell "a2" has value label "labelIdentity"

