package org.example;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon){
        this.name = name;

        if (healthPercentage > 100){
            this.healthPercentage = 100;
        } else this.healthPercentage = Math.max(healthPercentage, 0);
        this.weapon = weapon;
    }

    public double healthRemaining(){
        return this.healthPercentage;
    }

    public int loseHealth(int damage){
        if(this.healthPercentage - damage <= 0) {
            System.out.println(this.name + "player has been knocked out of game");
            this.healthPercentage = 0;
            return this.healthPercentage;
        }
        this.healthPercentage = this.healthPercentage - damage;
        return this.healthPercentage;
    }

    public int restoreHealth(int healthPotion){
        this.healthPercentage = Math.min(this.healthPercentage + healthPotion, 100);
        return this.healthPercentage;
    }
}
