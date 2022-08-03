Feature: subtraction test

  Background: calculator is up and running and waiting for two numbers to subtract
    Given calculator is up and running

  Scenario: user subtracts two numbers and gets the result
    When first number equals 30
    And second number equals 20
    Then the result of subtraction is 10