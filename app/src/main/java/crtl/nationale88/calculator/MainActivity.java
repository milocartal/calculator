package crtl.nationale88.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements CalculatorView {
    private EditText firstNumberEditText;
    private EditText secondNumberEditText;
    private TextView resultTextView;

    private CalculatorController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = findViewById(R.id.firstNumberEditText);
        secondNumberEditText = findViewById(R.id.secondNumberEditText);
        resultTextView = findViewById(R.id.resultTextView);

        CalculatorModel model = new CalculatorModel();
        controller = new CalculatorController(model, this);

        findViewById(R.id.addButton).setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                controller.onAddButtonClicked();
            }
        });

        findViewById(R.id.subtractButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.onSubtractButtonClicked();
            }
        });

        findViewById(R.id.multiplyButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.onMultiplyButtonClicked();
            }
        });

        findViewById(R.id.divideButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.onDivideButtonClicked();
            }
        });
    }

    @Override
    public double getFirstNumber() {
        String text = firstNumberEditText.getText().toString();
        if (TextUtils.isEmpty(text)) {
            throw new IllegalArgumentException("First number cannot be empty");
        }
        return Double.parseDouble(text);
    }

    @Override
    public double getSecondNumber() {
        String text = secondNumberEditText.getText().toString();
        if (TextUtils.isEmpty(text)) {
            throw new IllegalArgumentException("Second number cannot be empty");
        }
        return Double.parseDouble(text);
    }

    @Override
    public void showResult(double result) {
        resultTextView.setText(String.format(Locale.getDefault(), "%.2f", result));
    }

    @Override
    public void showError(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}

