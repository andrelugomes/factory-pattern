package br.com.andreluisgomes.abstractfactory;

import br.com.andreluisgomes.abstractfactory.domain.Elf;
import br.com.andreluisgomes.abstractfactory.domain.Orc;
import br.com.andreluisgomes.abstractfactory.domain.Warrior;
import br.com.andreluisgomes.abstractfactory.domain.WarriorType;
import br.com.andreluisgomes.abstractfactory.factory.AbstractFactory;
import br.com.andreluisgomes.abstractfactory.factory.WarriorFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class AbstractWarriorFactoryTest {

    @Test
    public void shouldCreateAElfWarriorWithoutElfFactory() {

        WarriorFactory factory = AbstractFactory.getFactory(WarriorType.ELF);
        Warrior elf = factory.createWarrior();

        assertThat(elf).isInstanceOf(Elf.class);
    }

    @Test
    public void shouldCreateAOrcWarriorWithoutElfFactory(){

        WarriorFactory factory = AbstractFactory.getFactory(WarriorType.ORC);
        Warrior orc = factory.createWarrior();

        assertThat(orc).isInstanceOf(Orc.class);
    }
}