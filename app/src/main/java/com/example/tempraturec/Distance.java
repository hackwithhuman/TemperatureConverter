package com.example.tempraturec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Distance extends AppCompatActivity {
    Button btn;
    TextView show;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance);

        // celcius to farenheit

        btn = findViewById(R.id.buttonf);
        show= findViewById(R.id.showf);
        input= findViewById(R.id.inputf);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Distance.this, "Converted", Toast.LENGTH_SHORT).show();
            String s = input.getText().toString();
            float f = Float.parseFloat(s);
            float i = (f*9/5)+32;
            String s1 = Float.toString(i);
            show.setText(s1 + "Fahrenheit");

            }
        });

    }
}