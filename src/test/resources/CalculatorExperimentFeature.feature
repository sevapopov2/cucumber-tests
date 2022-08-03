Feature: experimental feature with types selection

  Background: the user should be able to choose the type of operation between the subtraction and multiplication

  Scenario: user chooses addition while counting
    When first number equals 6
    And second number equals 5
    And type of operation is "+"
    Then the result of addition is 11

    Scenario: user wants to choose multiplication instead of addition
      When first number equals 6
      And second number equals 5
      And type of operation is "*"
      Then the result of multiplication is 30
