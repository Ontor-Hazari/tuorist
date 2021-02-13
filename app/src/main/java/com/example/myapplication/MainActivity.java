package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button10  = (Button)findViewById(R.id.button10);

        button10.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(MainActivity.this,secondpage.class);
        startActivity(intent);

    }
}