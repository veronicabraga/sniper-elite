package org.academiadecodigo.bootcamp;

public abstract class Enemy extends GameObject implements Shootable{

    private int health;
    private boolean isDead;
    private boolean isDestroyed;

    public Enemy() {
        health = 60;
        isDead = false;
        isDestroyed = false;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int healthCount) {
        health = healthCount;
    }

    public boolean isDead() {
        return isDead;
    }

    public void setIsDead(boolean isDead) {
        this.isDead = isDead;
    }


    public boolean isDestroyed() {
        return isDestroyed;
    }

    public void setIsDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }

    //public abstract void hit(int bulletDamage);

    public String getMessage() {
        return "X";
    }
}
