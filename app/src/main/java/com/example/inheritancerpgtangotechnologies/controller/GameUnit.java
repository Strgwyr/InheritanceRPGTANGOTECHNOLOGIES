package com.example.inheritancerpgtangotechnologies.controller;

public class GameUnit {

    private int healthPoint;
    private int manaPoint;
    private double armorPoint;
    private  int damage;
    public GameUnit(){}

    public GameUnit(int healthPoint, int manaPoint, double armorPoint , int damage) {
        this.healthPoint = healthPoint;
        this.manaPoint = manaPoint;
        this.armorPoint = armorPoint;
        this.damage = damage;
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
    public int getdamage() {
        return damage;
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
    public void setDamage(int damage) {
        this.damage = damage;
    }
}
