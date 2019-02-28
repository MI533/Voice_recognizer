package com.example.admin.voicerecognizer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {
TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        t=(TextView) findViewById(R.id.textView2);
        t.setText("Switch on the Internet and try again ");
    }
}
