package com.example.viikko8;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText EuroInput;
    private TextView ResultText;
    private Button USDButton;
    private Button GDPButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EuroInput = findViewById(R.id.EuroInput);
        ResultText = findViewById(R.id.ResultText);
        USDButton = findViewById(R.id.USDButton);
        GDPButton = findViewById(R.id.GDPButton);
    }

    public void convertToDollars(View view) {
        String inputText = EuroInput.getText().toString();

        double euros = Double.parseDouble(inputText);
        double dollars = euros * 1.05;
        String result = String.format("%s%.2f", dollars);
        ResultText.setText(result);
    }

    public void convertToPounds(View view) {
        String inputText = EuroInput.getText().toString();

        double euros = Double.parseDouble(inputText);
        double pounds = euros * 0.83;
        String result = String.format("%s%.2f", pounds);
        ResultText.setText(result);
    }
}
