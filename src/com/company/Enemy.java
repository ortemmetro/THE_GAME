package com.company;

public class Enemy {
    private String type;
    private String health_points;
    private String armor_points;
    private double damage;
    private double critical_damage;
    private String drop;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHealth_points() {
        return health_points;
    }

    public void setHealth_points(String health_points) {
        this.health_points = health_points;
    }

    public String getArmor_points() {
        return armor_points;
    }

    public void setArmor_points(String armor_points) {
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

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }
}