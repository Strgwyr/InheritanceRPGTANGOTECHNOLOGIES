package com.example.inheritancerpgtangotechnologies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.inheritancerpgtangotechnologies.view.Select;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button splashtocharacter = findViewById(R.id.splashtocharacter);


        splashtocharacter.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        Intent i = new Intent(MainActivity.this, Select.class
        );

        startActivity(i);




        switch (v.getId()) {
            case R.id.splashtocharacter:
                startActivity(i);


                break;

        }
    }
}