package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Mage.Disabler;
import com.example.inheritancerpgtangotechnologies.controller.Mage.Wizard;
import com.example.inheritancerpgtangotechnologies.controller.Monster;

public class DisablerFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disabler_fight);

        Disabler disabler = new Disabler(1400, 1600, 90);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back3);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(disabler.getHealthPoint()));
        txtHeromana.setText(Integer.toString(disabler.getManaPoint()));
        txtHerodamage.setText(Integer.toString(disabler.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));


    }

    @Override
    public void onClick(View v) {

        Intent back = new Intent(DisablerFight.this, Select.class
        );
        startActivity(back);

        switch (v.getId()) {
            case R.id.back3:
                startActivity(back);
        }
    }
}