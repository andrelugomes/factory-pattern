package br.com.andreluisgomes.enumfactory.domain;

public class LightElves implements Elves {

    static final String OLD_NORSE = "Lj�s�lfar";

    @Override
    public String oldNorse() {
        return OLD_NORSE;
    }
}