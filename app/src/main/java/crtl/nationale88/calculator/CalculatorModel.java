package crtl.nationale88.calculator;

public class CalculatorModel {
    private double firstNumber;
    private double secondNumber;

    public double add() {
        return firstNumber + secondNumber;
    }

    public double subtract() {
        return firstNumber - secondNumber;
    }

    public double multiply() {
        return firstNumber * secondNumber;
    }

    public double divide() {
        if (secondNumber == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return firstNumber / secondNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }
}

