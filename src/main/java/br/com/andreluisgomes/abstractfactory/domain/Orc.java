package br.com.andreluisgomes.abstractfactory.domain;

public class Orc implements Warrior {

    static final String BATTLE_CRY = "Kagh! Bin mog g'thazag cha!";

    @Override
    public String battleCry() {
        return BATTLE_CRY;
    }
}