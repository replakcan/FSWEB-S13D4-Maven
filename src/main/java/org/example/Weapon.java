package org.example;

public enum Weapon {
    SWORD(20, 4),
    DAGGER(10, 8),
    CROSSBOW(7, 1),
    WAR_HAMMER(45, .5);

    private int damage;
    private double attackSpeed;

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    Weapon(int damage, double attackSpeed){
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

}
