package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Carry.HardCarry;
import com.example.inheritancerpgtangotechnologies.controller.Mage.Disabler;

public class Select extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        Button tankb = findViewById(R.id.protectorb);
        Button healerb = findViewById(R.id.setterb);
        Button disabler = findViewById(R.id.disablerb);
        Button mageb = findViewById(R.id.wizardb);
        Button burstb = findViewById(R.id.burstb);
        Button hardcarryb = findViewById(R.id.hardcarryb);
        Button saviorb = findViewById(R.id.saviorb);
        Button regeneratorb = findViewById(R.id.regeneratorb);


        tankb.setOnClickListener(this);
        healerb.setOnClickListener(this);
        disabler.setOnClickListener(this);
        mageb.setOnClickListener(this);
        burstb.setOnClickListener(this);
        hardcarryb.setOnClickListener(this);
        saviorb.setOnClickListener(this);
        regeneratorb.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        Intent protector = new Intent(Select.this, ProtectorFight.class
        );
        startActivity(protector);

        Intent setter = new Intent(Select.this, SetterFight.class
        );
        startActivity(setter);

        Intent disabler = new Intent(Select.this, DisablerFight.class
        );
        startActivity(disabler);

        Intent wizard = new Intent(Select.this, WizardFight.class
        );
        startActivity(wizard);

        Intent burst = new Intent(Select.this, BurstFight.class
        );
        startActivity(burst);

        Intent hardcarry = new Intent(Select.this, HardCarryFight.class
        );
        startActivity(hardcarry);

        Intent savior = new Intent(Select.this, SaviorFight.class
        );
        startActivity(savior);

        Intent regenerator = new Intent(Select.this, RegeneratorFight.class
        );
        startActivity(regenerator);



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

            case R.id.burstb:
                startActivity(burst);

                break;

            case R.id.hardcarryb:
                startActivity(hardcarry);

                break;

            case R.id.saviorb:
                startActivity(savior);

                break;

            case R.id.regeneratorb:
                startActivity(regenerator);

                break;


        }
    }
}


   