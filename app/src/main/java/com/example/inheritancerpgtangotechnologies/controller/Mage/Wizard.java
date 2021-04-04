package com.example.inheritancerpgtangotechnologies.controller.Mage;

import com.example.inheritancerpgtangotechnologies.controller.Hero;

public class Wizard extends Hero {

    public int healthPoint = 800;
    public int manaPoint = 2000;
    public double armorPoint = 5.0;
    int heroId = 4;
    String heroName = "Wizard";
    int heroLevel = 25;
    int heroSTR = 10;
    int heroAGI = 17;
    int heroINT = 32;
    int heroToughness = 10;
    int heroEvasion = 5;
    int heroLuck = 2;
    int damage = 102;


    public Wizard() {
    }

    public Wizard(int heroId, String heroName, int healthPoint, int manaPoint, int damage) {
    }
}
