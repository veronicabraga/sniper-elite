package org.academiadecodigo.bootcamp;

public class SoldierEnemy extends Enemy {


    /*public SoldierEnemy() {
        super();
    }*/

    public void hit(int bulletDamage) {
        setHealth(getHealth() - bulletDamage);
        System.out.println("The Soldier Enemy has " + getHealth() + " health points.");

    }
}
