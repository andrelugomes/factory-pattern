package br.com.andreluisgomes.simplefactory.domain;

/**
 * Created by andre on 16/02/18.
 */
public class Vegeta implements Saiyajin {

    private Long power;

    public Vegeta(Long power) {
        this.power = power;
    }

    @Override
    public Long getPower(){
        return power;
    }
}
