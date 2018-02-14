package br.com.andreluisgomes.abstractfactory.factory;

import br.com.andreluisgomes.abstractfactory.domain.Elf;
import br.com.andreluisgomes.abstractfactory.domain.Warrior;


public class OrcWarriorFactory implements WarriorFactory {

    @Override
    public Warrior createWarrior() {
        return new Elf();
    }
}
