package br.com.andreluisgomes.abstractfactory.factory;

import br.com.andreluisgomes.abstractfactory.domain.Orc;
import br.com.andreluisgomes.abstractfactory.domain.Warrior;

public class OrcWarriorFactory extends AbstractFactory implements WarriorFactory {

    @Override
    public Warrior createWarrior() {
        return new Orc();
    }
}
