package com.example.inheritancerpgtangotechnologies.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.inheritancerpgtangotechnologies.R;
import com.example.inheritancerpgtangotechnologies.controller.Tank.Protector;

public class ProtectorFight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protector_fight);

      Protector protector = new Protector(2000, 500, 127);

        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeroDPT = findViewById(R.id.heroDamage);
        txtHeroHP.setText(Integer.toString(protector.getHealthPoint()));
    }
}