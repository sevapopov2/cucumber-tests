Feature: division test
  Background: this is a test on dividing of two numbers
    Given calculator is up and running
    Scenario: users enters two numbers to get a division result
      When first number equals 50
      And second number equals 5
      Then the division result is 10
