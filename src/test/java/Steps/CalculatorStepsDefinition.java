package Steps;

import App.Calculator;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class CalculatorStepsDefinition {
    private Calculator calculator;
    int num1;
    int num2;

    @Given("calculator is up and running")
    public void calculatorStarts() {
        calculator = new Calculator();
        System.out.println("Calculator was turned on!");
    }

    @When("first number equals {int}")
    public void firstNumberEquals(int num) {
        num1 = num;
        System.out.println("The first number is " + num);
    }

    @And("second number equals {int}")
    public void secondNumberEquals(int num) {
        num2 = num;
        System.out.println("The second number is " + num);
    }

    @Then("the result should be equal {int}")
    public void theResultShouldBeEqual(int expectedResult) {
        int actualResult = calculator.addTwoNumbers(num1, num2);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Then("the result of subtraction is {int}")
    public void theResultOfSubtractionIs(int expectedResult) {
        int actualResult = calculator.subtractTwoNumbers(num1, num2);
    }

    @Then("the result of multiplication is {int}")
    public void theResultOfMultiplicationIs(int expectedResult) {
        int actualResult = calculator.multiplyTwoNumbers(num1, num2);
    }

    @Then("the division result is {int}")
    public void theDivisionResultIs(int expectedResult) {
        int actualResult = calculator.divideTwoNumbers(num1, num2);
        }
    }
}
