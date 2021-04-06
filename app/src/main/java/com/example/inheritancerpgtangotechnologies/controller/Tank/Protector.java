package com.example.inheritancerpgtangotechnologies.controller.Tank;

import com.example.inheritancerpgtangotechnologies.controller.Hero;

public class Protector extends Hero {

    public int healthPoint = 1000;
    public int manaPoint = 500;
    public double armorPoint;
    int heroId;
    String heroName;
    int heroLevel;
    int heroSTR;
    int heroAGI;
    int heroINT5;
    int heroToughness;
    int heroEvasion;
    int heroLuck;
    int damage = 120;



    public Protector( int healthPoint, int manaPoint, int damage) {
        setHealthPoint(healthPoint);
        setManaPoint(manaPoint);
        setDamage(damage);
        this.damage = damage;
        this.healthPoint =     healthPoint;
        this.manaPoint =     manaPoint;
        this.damage =     damage;

    }
}



