package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Monster;
import com.example.inheritancerpgtangotechnologies.controller.Tank.Protector;
import com.example.inheritancerpgtangotechnologies.controller.Tank.Setter;

public class SetterFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setterfight);

        Setter setter = new Setter(1800, 700, 119);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back6);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(setter.getHealthPoint()));
        txtHeromana.setText(Integer.toString(setter.getManaPoint()));
        txtHerodamage.setText(Integer.toString(setter.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));


    }
    @Override
    public void onClick(View v) {
        Button back = findViewById(R.id.back6);
        back.setOnClickListener(this);

        Intent back6 = new Intent(SetterFight.this, Select.class
        );
        startActivity(back6);

        switch (v.getId()) {
            case R.id.back6:
                startActivity(back6);
        }
    }
}