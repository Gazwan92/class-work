package com.example.gazwan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Empty extends AppCompatActivity {


    TextView usertTv;
    TextView passTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empty);
        usertTv=findViewById(R.id.editT1);
        passTv=findViewById(R.id.editT2);
    }
}
