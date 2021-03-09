package com.company.entities;

public class Enemy {
    private String type;
    private double health_points;
    private double armor_points;
    private double damage;
    private double critical_damage;
    private String drop_weapon;
    private String drop_potions;
    private double drop_coins;

    public String getDrop_weapon() {
        return drop_weapon;
    }

    public void setDrop_weapon(String drop_weapon) {
        this.drop_weapon = drop_weapon;
    }

    public String getDrop_potions() {
        return drop_potions;
    }

    public void setDrop_potions(String drop_potions) {
        this.drop_potions = drop_potions;
    }

    public double getDrop_coins() {
        return drop_coins;
    }

    public void setDrop_coins(double drop_coins) {
        this.drop_coins = drop_coins;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHealth_points() {
        return health_points;
    }

    public void setHealth_points(double health_points) {
        this.health_points = health_points;
    }

    public double getArmor_points() {
        return armor_points;
    }

    public void setArmor_points(double armor_points) {
        this.armor_points = armor_points;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public double getCritical_damage() {
        return critical_damage;
    }

    public void setCritical_damage(double critical_damage) {
        this.critical_damage = critical_damage;
    }
}