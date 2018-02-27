package br.com.andreluisgomes.servicelocatormanual.domain;

import org.springframework.stereotype.Component;

@Component
public class Gnomevil implements Dwarf {

    @Override
    public String name() {
        return "Gnomevil";
    }

    @Override
    public Long hp() {
        return 250000L;
    }

    @Override
    public Long exp() {
        return 45000L;
    }
}
