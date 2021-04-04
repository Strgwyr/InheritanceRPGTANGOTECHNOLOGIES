package com.example.inheritancerpgtangotechnologies.controller;

public class GameUnit {

    private int healthPoint;
    private int manaPoint;
    private double armorPoint;

    public GameUnit(){}

    public GameUnit(int healthPoint, int manaPoint, double armorPoint) {
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.armorPoint = armorPoint;
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    public int getManaPoint() {
        return manaPoint;
    }
    public double getArmorPoint() {
        return armorPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }
    public void setArmorPoint(double armorPoint) {
        this.armorPoint = armorPoint;
    }

    public void setManaPoint(int manaPoint) {
        this.manaPoint = manaPoint;
    }
}
