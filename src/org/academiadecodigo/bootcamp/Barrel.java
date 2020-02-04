package org.academiadecodigo.bootcamp;

public class Barrel extends GameObject implements Shootable {


        private boolean destroyed;
        private int currentDamage;
        private BarrelType barrelType;

        public Barrel() {
            barrelType = randomBarrelType();
        }


    public void hit(int bulletDamage) {

        currentDamage = bulletDamage + currentDamage;
        System.out.println("The barrel of " + barrelType.getType() + " has " + currentDamage + " points of damage.");
        if (currentDamage == barrelType.getMaxDamage()) {
            destroyed = true;
            System.out.println("The barrel was destroyed!");
        }

    }


    public boolean isDestroyed() {
        return destroyed;
    }

    public void setIsDestroyed(boolean isDestroyed) {
        destroyed = isDestroyed;
    }

    public String getMessage() {
        return "X";
    }

    public BarrelType randomBarrelType() {

        double probMetal = 0.5;
        double probWood = 0.3;
        //double probPlastic = 0.2;

        double result = Math.random();

        if (result >= probMetal) {
             barrelType = BarrelType.METAL;
             return barrelType;

        } else if (result >= probWood && result < probMetal) {
            barrelType = BarrelType.WOOD;
            return barrelType;

        } else {
            barrelType = BarrelType.PLASTIC;
            return barrelType;
        }
    }

    @Override
    public String toString() {
        return "Barrel{" +
                "destroyed=" + destroyed +
                ", currentDamage=" + currentDamage +
                ", barrelType=" + barrelType +
                ", barrelHP=" + barrelType.getMaxDamage() +
                '}';
    }
}
