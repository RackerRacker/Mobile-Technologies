package com.example.mobiletechapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View view) {
        final TextView textView = (TextView) findViewById(R.id.textViewOutput);
        EditText editText = (EditText) findViewById(R.id.inputText);
        if (editText.getText().length() == 0)
            textView.setText("Please enter a message");
        else
            textView.setText(editText.getText());

        Toast.makeText(this, "OK button pressed", Toast.LENGTH_LONG).show();
    }
}