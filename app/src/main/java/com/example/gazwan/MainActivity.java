package com.example.gazwan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText firstEt;
    EditText lastEt;
    String username;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstEt=findViewById(R.id.editT1);
        lastEt=findViewById(R.id.editT2);

    }

    public void login(View view) {
         username=firstEt.getText().toString();
         password=lastEt.getText().toString();

        Toast.makeText(this, username, Toast.LENGTH_SHORT).show();

    }

    public void signup(View view) {
        Intent intent=new Intent(MainActivity.this,Empty.class);

        intent.putExtra("user",username);
        intent.putExtra("user",password);

        startActivity(intent);
    }

    public void facebook(View view) {
        Toast.makeText(this,"facebook", Toast.LENGTH_SHORT).show();

    }

    public void google(View view) {
        Toast.makeText(this,"google", Toast.LENGTH_SHORT).show();

    }

    public void twitter(View view) {
        Toast.makeText(this,"twitter", Toast.LENGTH_SHORT).show();
    }
}
