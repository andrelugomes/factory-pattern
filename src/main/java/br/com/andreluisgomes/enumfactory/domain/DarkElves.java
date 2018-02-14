package br.com.andreluisgomes.enumfactory.domain;

public class DarkElves implements Elves {

    static final String OLD_NORSE = "Dökkálfar";

    @Override
    public String oldNorse() {
        return OLD_NORSE;
    }
}