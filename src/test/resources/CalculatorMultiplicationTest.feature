Feature: multiplication test
  Background: the calculator performs a multiplication test
    Given calculator is up and running
    Scenario: user enters two numbers and gets a result of multiplication
      When first number equals 20
      And second number equals 20
      Then the result of multiplication is 400