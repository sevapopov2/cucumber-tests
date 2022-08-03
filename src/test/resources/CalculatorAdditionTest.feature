Feature: calculator addition test

  Background: the calculator is on
    Given calculator is up and running
#  The simple addition test
  Scenario: user tryes to get a result of two numbers addition
    When first number equals 5
    And second number equals 5
    Then the result should be equal 10

#  The tables test
  Scenario Outline: user tryes to get a result of two numbers addition with several numbers
    When first number equals <num1>
    And second number equals <num2>
    Then the result should be equal <expectedResult>
    Examples:
      | num1 | num2 | expectedResult |
      | 30   | 5    | 35             |
      | 50   | 150  | 200            |
      | 1000 | 500  | 1500           |
      | 2000 | 2000 | 4000           |

  Scenario: user tries to subtract two numbers
    When first number equals 30
    And second number equals 20
    Then the result should be equal 10