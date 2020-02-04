package org.academiadecodigo.bootcamp;

public enum BarrelType {
    PLASTIC(10, "plastic"),
    WOOD(20, "wood"),
    METAL(40, "metal");

    private int maxDamage;
    private String type;

    BarrelType(int damage, String type){
        this.maxDamage = damage;
        this.type = type;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public String getType() {
        return type;
    }

}
