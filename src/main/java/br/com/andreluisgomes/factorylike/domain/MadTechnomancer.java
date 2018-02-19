package br.com.andreluisgomes.factorylike.domain;

import org.springframework.stereotype.Component;

@Component
public class MadTechnomancer implements Dwarf {

    @Override
    public String name() {
        return "MadTechnomancer";
    }

    @Override
    public Long hp() {
        return 1800L;
    }

    @Override
    public Long exp() {
        return 55L;
    }
}
