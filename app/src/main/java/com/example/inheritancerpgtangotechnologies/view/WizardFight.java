package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Mage.Wizard;
import com.example.inheritancerpgtangotechnologies.controller.Monster;
import com.example.inheritancerpgtangotechnologies.controller.Tank.Setter;

public class WizardFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizard_fight);

        Wizard wizard = new Wizard(800, 2000, 85);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back8);
        back.setOnClickListener(this);



        txtHeroHP.setText(Integer.toString(wizard.getHealthPoint()));
        txtHeromana.setText(Integer.toString(wizard.getManaPoint()));
        txtHerodamage.setText(Integer.toString(wizard.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));


    }
    @Override
    public void onClick(View v) {
        Button back = findViewById(R.id.back8);
        back.setOnClickListener(this);

        Intent back8 = new Intent(WizardFight.this, Select.class
        );
        startActivity(back8);

        switch (v.getId()) {
            case R.id.back8:
                startActivity(back8);
        }
    }
}