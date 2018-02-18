package br.com.andreluisgomes.abstractfactory.domain;

public class Elf implements Warrior {

    static final String BATTLE_CRY = "Él síla lúmena vomentienguo";

    @Override
    public String battleCry() {
        return BATTLE_CRY;
    }

}