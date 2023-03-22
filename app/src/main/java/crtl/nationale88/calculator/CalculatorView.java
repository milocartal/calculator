package crtl.nationale88.calculator;

public interface CalculatorView {
    double getFirstNumber();
    double getSecondNumber();

    void showResult(double result);
    void showError(String message);
}

