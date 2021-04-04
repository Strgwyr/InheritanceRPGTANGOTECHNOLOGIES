package com.example.inheritancerpgtangotechnologies.controller.Mage;

import com.example.inheritancerpgtangotechnologies.controller.Hero;

public class Disabler extends Hero {

    public int healthPoint = 1200;
    public int manaPoint = 800;
    public double armorPoint = 7.0;
    int heroId = 3;
    String heroName = "Disabler";
    int heroLevel = 25;
    int heroSTR = 14;
    int heroAGI = 21;
    int heroINT = 25;
    int heroToughness = 10;
    int heroEvasion = 5;
    int heroLuck = 2;
    int damage = 82;


    public Disabler() {
    }

    public Disabler(int heroId, String heroName, int healthPoint, int manaPoint, int damage) {
    }
}
