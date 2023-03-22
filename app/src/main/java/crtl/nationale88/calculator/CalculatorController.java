package crtl.nationale88.calculator;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void onAddButtonClicked() {
        try {
            model.setFirstNumber(view.getFirstNumber());
            model.setSecondNumber(view.getSecondNumber());
            double result = model.add();
            view.showResult(result);
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    public void onSubtractButtonClicked() {
        try {
            model.setFirstNumber(view.getFirstNumber());
            model.setSecondNumber(view.getSecondNumber());
            double result = model.subtract();
            view.showResult(result);
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    public void onMultiplyButtonClicked() {
        try {
            model.setFirstNumber(view.getFirstNumber());
            model.setSecondNumber(view.getSecondNumber());
            double result = model.multiply();
            view.showResult(result);
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }

    public void onDivideButtonClicked() {
        try {
            model.setFirstNumber(view.getFirstNumber());
            model.setSecondNumber(view.getSecondNumber());
            double result = model.divide();
            view.showResult(result);
        } catch (Exception e) {
            view.showError(e.getMessage());
        }
    }
}

