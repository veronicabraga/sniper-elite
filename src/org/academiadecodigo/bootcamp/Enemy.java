package org.academiadecodigo.bootcamp;

public abstract class Enemy extends GameObject{

    private int health;
    private boolean isDead;

    public Enemy() {
        health = 60;
        isDead = false;
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

    public abstract void hit(int bulletDamage);

    public String getMessage() {
        return "X";
    }
}
