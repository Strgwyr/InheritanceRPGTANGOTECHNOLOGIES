package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.inheritancerpgtangotechnologies.R;

public class Select extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button tankb = findViewById(R.id.protectorb);
        Button healerb = findViewById(R.id.setterb);
        Button burstb = findViewById(R.id.disablerb);
        Button mageb = findViewById(R.id.wizardb);


        tankb.setOnClickListener(this);
        healerb.setOnClickListener(this);
        burstb.setOnClickListener(this);
        mageb.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent protector = new Intent(Select.this, ProtectorFight.class
        );
        startActivity(protector);

        Intent setter = new Intent(Select.this, Select.class
        );
        startActivity(setter);

        Intent disabler = new Intent(Select.this, Select.class
        );
        startActivity(disabler);

        Intent wizard = new Intent(Select.this, Select.class
        );
        startActivity(wizard);



        switch (v.getId()) {
            case R.id.protectorb:
                startActivity(protector);

                break;

            case R.id.setterb:
                startActivity(setter);

                break;

            case R.id.disablerb:
                startActivity(disabler);

                break;

            case R.id.wizardb:
                startActivity(wizard);

                break;


        }
    }
}


   