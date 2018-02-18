package br.com.andreluisgomes.abstractfactory.factory;

import br.com.andreluisgomes.abstractfactory.domain.Warrior;
import br.com.andreluisgomes.abstractfactory.domain.Elf;

public class ElfWarriorFactory extends AbstractFactory implements WarriorFactory {

    @Override
    public Warrior createWarrior() {
        return new Elf();
    }
}
