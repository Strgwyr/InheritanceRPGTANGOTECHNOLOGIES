package com.example.inheritancerpgtangotechnologies.controller;

public class Monster extends GameUnit {


    String heroname = "Roshan";
    int healthPoint = 2000;
    int manaPoint = 5000;
    double armorPoint = 20;
    int damage = 250;

    public Monster(int healthPoint, int manaPoint, int damage) {
        setHealthPoint(healthPoint);
        setManaPoint(manaPoint);
        setDamage(damage);
        this.damage = damage;
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.damage = damage;

    }
}
