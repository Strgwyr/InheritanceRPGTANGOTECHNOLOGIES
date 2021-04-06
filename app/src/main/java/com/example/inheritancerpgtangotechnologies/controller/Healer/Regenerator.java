package com.example.inheritancerpgtangotechnologies.controller.Healer;

import com.example.inheritancerpgtangotechnologies.controller.Hero;

public class Regenerator extends Hero {

    public int healthPoint;
    public int manaPoint;
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



    public Regenerator( int healthPoint, int manaPoint, int damage) {
        setHealthPoint(healthPoint);
        setManaPoint(manaPoint);
        setDamage(damage);
        this.damage = damage;
        this.healthPoint =     healthPoint;
        this.manaPoint =     manaPoint;
        this.damage =     damage;

    }
}