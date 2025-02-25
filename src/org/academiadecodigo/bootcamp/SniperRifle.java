package org.academiadecodigo.bootcamp;

public class SniperRifle {

    private int bulletDamage;
    private double succeedShootProb;

    public SniperRifle() {
        bulletDamage = 10;
        succeedShootProb = 0.6;
    }



    public void shoot(Shootable shootable) {

        double result = Math.random();

        if (result >= succeedShootProb) {
            System.out.println("The sniper succeeded in his shot.");
            shootable.hit(bulletDamage);

        } else {
            System.out.println("The sniper did not have a succeeded shot.");
        }
    }
}
