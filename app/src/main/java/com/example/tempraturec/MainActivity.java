package com.example.tempraturec;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     ImageView celcius , farenheit ;
     LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      celcius=findViewById(R.id.farenheitImage);
      farenheit=findViewById(R.id.celciusImage);


     celcius.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent gotodistance = new Intent(MainActivity.this , Distance.class);
             startActivity(gotodistance);
         }
     });

     farenheit.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent gototemprature = new Intent(MainActivity.this , Temprature.class);
             startActivity(gototemprature);
         }
     });

    }
}