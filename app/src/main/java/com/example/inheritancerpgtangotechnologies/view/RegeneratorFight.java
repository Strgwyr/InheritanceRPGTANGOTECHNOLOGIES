package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Healer.Regenerator;
import com.example.inheritancerpgtangotechnologies.controller.Healer.Savior;
import com.example.inheritancerpgtangotechnologies.controller.Monster;

public class RegeneratorFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regenerator);

        Regenerator regenerator = new Regenerator(1100, 1200, 120);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back7);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(regenerator.getHealthPoint()));
        txtHeromana.setText(Integer.toString(regenerator.getManaPoint()));
        txtHerodamage.setText(Integer.toString(regenerator.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));
    }

    @Override
    public void onClick(View v) {

        Intent back = new Intent(RegeneratorFight.this, Select.class
        );
        startActivity(back);

        switch (v.getId()) {
            case R.id.back7:
                startActivity(back);
        }
    }
}