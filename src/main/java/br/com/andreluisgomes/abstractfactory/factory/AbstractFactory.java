package br.com.andreluisgomes.abstractfactory.factory;

import br.com.andreluisgomes.abstractfactory.domain.WarriorType;

/**
 * Created by andre on 17/02/18.
 */
public abstract class AbstractFactory {

    public static WarriorFactory getFactory(final WarriorType type) {
        WarriorFactory factory = null;
        switch (type){
            case ELF:
                factory = new ElfWarriorFactory();
                break;
            case ORC:
                factory = new OrcWarriorFactory();
                break;
        }
        return factory;
    }
}
