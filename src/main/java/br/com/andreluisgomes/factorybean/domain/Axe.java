package br.com.andreluisgomes.factorybean.domain;

public class Axe {

    private int attack;
    private int defense;
    private Hands hands;
    private WeaponType type;

    public Axe(int attack, int defense, Hands hands, WeaponType type) {
        this.attack = attack;
        this.defense = defense;
        this.hands = hands;
        this.type = type;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public Hands getHands() {
        return hands;
    }

    public WeaponType getType() {
        return type;
    }
}
