Feature: Remove repeated characters from a string

  Scenario: Remove duplicate characters from a given string
    Given the input string is "<input>"
    When I remove repeated characters
    Then the result should be "<output>"

    
      Examples:
      | input| output|
      | programming| poain|
      | programmin| pogain|
      | programmi| pogai|