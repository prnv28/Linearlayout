package com.example.pranav.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class electronics extends AppCompatActivity {

    TextView countview1;
    TextView countview2;
    TextView countview3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clay);

        countview1 = (TextView) findViewById(R.id.textView8);
        countview2 = (TextView) findViewById(R.id.textView9);
        countview3 = (TextView) findViewById(R.id.textView10);

        countview1.setText("talking robot");
        countview2.setText("Car");
        countview3.setText("Helicopter");
    }
}
