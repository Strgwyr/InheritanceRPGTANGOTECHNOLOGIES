package com.example.inheritancerpgtangotechnologies.controller.Tank;

import com.example.inheritancerpgtangotechnologies.controller.Hero;

public class Setter extends Hero {


    public int healthPoint = 1800;
    public int manaPoint = 400;
    public double armorPoint = 15.0;
    int heroId = 2;
    String heroName = "Setter";
    int heroLevel = 25;
    int heroSTR = 27;
    int heroAGI = 19;
    int heroINT = 18;
    int heroToughness = 10;
    int heroEvasion = 5;
    int heroLuck = 2;
    int damage = 137;


    public Setter() {
    }

    public Setter(int heroId, String heroName, int healthPoint, int manaPoint, int damage) {
    }
}
