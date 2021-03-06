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

public class ProtectorFight extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protector_fight);

      Protector protector = new Protector(2000, 500, 127);
        Monster roshan = new Monster(5000, 1000,127);


        TextView txtHeroHP = findViewById(R.id.heroHp);
        TextView txtHeromana = findViewById(R.id.heroMana);
        TextView txtHerodamage = findViewById(R.id.herodamage);
        TextView txtroshan = findViewById(R.id.roshanhp);
        Button back = findViewById(R.id.back5);
        back.setOnClickListener(this);


        txtHeroHP.setText(Integer.toString(protector.getHealthPoint()));
      txtHeromana.setText(Integer.toString(protector.getManaPoint()));
        txtHerodamage.setText(Integer.toString(protector.getdamage()));
        txtroshan.setText(Integer.toString(roshan.getHealthPoint()));


    }

    @Override
    public void onClick(View v) {

        Intent back = new Intent(ProtectorFight.this, Select.class
        );
        startActivity(back);

        switch (v.getId()) {
            case R.id.back5:
                startActivity(back);
        }
    }
}