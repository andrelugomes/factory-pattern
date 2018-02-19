package br.com.andreluisgomes.factorylike.domain;

import org.springframework.stereotype.Component;

@Component
public class ForemanKneebiter implements Dwarf {

    @Override
    public String name() {
        return "Foreman Kneebiter";
    }

    @Override
    public Long hp() {
        return 570L;
    }

    @Override
    public Long exp() {
        return 445L;
    }
}
