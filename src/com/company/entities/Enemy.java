package com.company.entities;

public class Enemy {
    private String type;
    private double health_points;
    private double armor_points;
    private double damage;
    private double critical_damage;
    private String drop;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Enemy(String type, double health_points, double armor_points, double damage, double critical_damage, String drop) {
        this.type = type;
        this.health_points = health_points;
        this.armor_points = armor_points;
        this.damage = damage;
        this.critical_damage = critical_damage;
        this.drop = drop;
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

    public String getDrop() {
        return drop;
    }

    public void setDrop(String drop) {
        this.drop = drop;
    }

    @Override
    public String toString() {
        return "\t" + type + ":" +
                "\n\t  Health: " + health_points +
                "\n\t  Armor: " + armor_points +
                "\n\t  Damage: " + damage
                ;
    }
}