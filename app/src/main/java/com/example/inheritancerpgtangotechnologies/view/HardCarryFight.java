package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Carry.Burst;
import com.example.inheritancerpgtangotechnologies.controller.Carry.HardCarry;
import com.example.inheritancerpgtangotechnologies.controller.Monster;

public class HardCarryFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hard_carry_fight);

        HardCarry hardCarry = new HardCarry(1800, 750, 250);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back4);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(hardCarry.getHealthPoint()));
        txtHeromana.setText(Integer.toString(hardCarry.getManaPoint()));
        txtHerodamage.setText(Integer.toString(hardCarry.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));
    }
    @Override
    public void onClick(View v) {

        Intent back = new Intent(HardCarryFight.this, Select.class
        );
        startActivity(back);

        switch (v.getId()) {
            case R.id.back4:
                startActivity(back);
        }
    }
}