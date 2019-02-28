package com.example.admin.voicerecognizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {
TextView t,d;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        t=(TextView) findViewById(R.id.textView);
        d=(TextView) findViewById(R.id.textView4);
        t.setText("This app is developed by M.Nandhakumar " +
                "G.Premmaran   " +
                "R.Prakathi   "+
        "P.Niraimathi");
        d.setText("Guided by Purushothamam.P ");
    }
}
