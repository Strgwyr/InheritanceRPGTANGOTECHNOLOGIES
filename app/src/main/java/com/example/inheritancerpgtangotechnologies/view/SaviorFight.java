package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Carry.Burst;
import com.example.inheritancerpgtangotechnologies.controller.Healer.Savior;
import com.example.inheritancerpgtangotechnologies.controller.Monster;

public class SaviorFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_savior_fight);


        Savior savior = new Savior(1300, 1000, 100);
        Monster roshan = new Monster(5000, 1000, 127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(savior.getHealthPoint()));
        txtHeromana.setText(Integer.toString(savior.getManaPoint()));
        txtHerodamage.setText(Integer.toString(savior.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));
    }

    @Override
    public void onClick(View v) {


        Intent back = new Intent(SaviorFight.this, Select.class
        );
        startActivity(back);

        switch (v.getId()) {
            case R.id.protectorb:
                startActivity(back);
        }
    }
}