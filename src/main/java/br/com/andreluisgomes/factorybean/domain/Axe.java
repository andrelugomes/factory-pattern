package br.com.andreluisgomes.factorybean.domain;

public class Axe {

    private int attack;
    private int defense;
    private Hands hands;
    private WeaponType type;

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

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setHands(Hands hands) {
        this.hands = hands;
    }

    public void setType(WeaponType type) {
        this.type = type;
    }
}
