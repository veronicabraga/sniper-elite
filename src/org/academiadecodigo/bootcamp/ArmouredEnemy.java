package org.academiadecodigo.bootcamp;

public class ArmouredEnemy extends Enemy{

    private int armour;

    public ArmouredEnemy() {
        armour = 40;
    }

    public void hit(int bulletDamage) {

        if (armour >= bulletDamage) {
            armour = armour - bulletDamage;
            System.out.println("The Armoured Enemy was shot and now he has " + armour + " armour points.");

        } else {
            setHealth(getHealth() - bulletDamage);
            System.out.println("The Armoured Enemy was shot, he does not have armour points anymore, he has " + getHealth() + " health points now.");
        }
    }

}
