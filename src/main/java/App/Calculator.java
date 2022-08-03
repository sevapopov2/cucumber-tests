package App;

public class Calculator {

    public int addTwoNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public int subtractTwoNumbers(int num1, int num2) {
        return num1 - num2;
    }

    public int multiplyTwoNumbers(int num1, int num2) {
        return num1 * num2;
    }

    public int divideTwoNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public int calculateTwoNumbers(int num1, int num2, String type) {
        switch (type) {
            case "+":
                return num1 + num2;
            case "*":
                return num1 * num2;
            default:
                return num1 + num2;

        }

    }
}
