package br.com.andreluisgomes.factorylike.domain;

import org.springframework.stereotype.Component;

@Component
public class Lloyd implements Dwarf {

    @Override
    public String name() {
        return "Lloyd";
    }

    @Override
    public Long hp() {
        return 64000L;
    }

    @Override
    public Long exp() {
        return 66000L;
    }
}
