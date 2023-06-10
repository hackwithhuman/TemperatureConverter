package com.example.tempraturec;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Temprature extends AppCompatActivity {

    Button btn1;
    TextView show1;
    EditText input1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);
        btn1 =findViewById(R.id.button);
        show1 =findViewById(R.id.show1);
        input1 =findViewById(R.id.editTextTextPersonName);
        btn1.setOnClickListener(new View.OnClickListener() {
            // Farenheit to celcius
            @Override
            public void onClick(View view) {
                Toast.makeText(Temprature.this, "Converted", Toast.LENGTH_SHORT).show();
                String s=input1.getText().toString();
               float f = Float.parseFloat(s);
               float c = (f-32)*5/9;
                String s1 = Float.toString(c);
                show1.setText(s1+"Celsius");

            }
        });

    }
}