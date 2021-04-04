package com.example.inheritancerpgtangotechnologies.controller;

public class Hero extends GameUnit {

    int heroId;
    String heroName;
    int heroLevel;
    int heroSTR;
    int heroAGI;
    int heroINT;
    int heroToughness;
    int heroEvasion;
    int heroLuck;


    public Hero() {
    }

    public Hero(int heroId, String heroName, int healthPoint, int manaPoint) {
        this.heroId = heroId;
        this.heroName = heroName;
        super.setHealthPoint(healthPoint);
        super.setManaPoint(manaPoint);
    }
}