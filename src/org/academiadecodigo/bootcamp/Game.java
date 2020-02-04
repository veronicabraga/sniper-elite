package org.academiadecodigo.bootcamp;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private int shotsFired;

    public Game(int num) {
        gameObjects = new GameObject[num];
        sniperRifle = new SniperRifle();
        createObjects(num);

    }


    public GameObject[] createObjects(int number) {

        for (int i = 0; i < number; i++ ) {
            gameObjects[i] = getRandomObject();
        }

        return gameObjects;


    }

    public GameObject getRandomObject() {

        double probArmoured = 0.7;
        double probSoldier = 0.4;
        double probBarrel = 0.2;
        //double probTree = 0.1;

        double result = Math.random();

        if (result >= probArmoured) {
            return new ArmouredEnemy();

        } else if (result < probArmoured && result >= probSoldier) {
            return new SoldierEnemy();

        } else if (result < probSoldier && result >= probBarrel) {
            return new Barrel();

        } else {
            return new Tree();
        }

    }

    public void start() {

        for (int i = 0; i < gameObjects.length; i++) {

            if (gameObjects[i] instanceof Shootable) {

                Shootable shootable = (Shootable) gameObjects[i];

                System.out.println("There is a shootable!");

                while (!shootable.isDestroyed()) {
                    sniperRifle.shoot(shootable);
                    shotsFired++;
                }


               /* while (enemy.getHealth() > 0) {
                    sniperRifle.shoot(enemy);
                    shotsFired++;
                }
                enemy.setIsDead(true);
                System.out.println("The enemy is dead, the sniper shot " + shotsFired + " shots."); */

            } else {
                //gameObjects[i].getMessage();
                System.out.println("I am a tree, you can not shoot me!");
            }
        }
    }
}
