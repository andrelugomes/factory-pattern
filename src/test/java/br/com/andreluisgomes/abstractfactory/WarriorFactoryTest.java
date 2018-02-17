package br.com.andreluisgomes.abstractfactory;

import br.com.andreluisgomes.abstractfactory.domain.Elf;
import br.com.andreluisgomes.abstractfactory.domain.Orc;
import br.com.andreluisgomes.abstractfactory.domain.Warrior;
import br.com.andreluisgomes.abstractfactory.factory.ElfWarriorFactory;
import br.com.andreluisgomes.abstractfactory.factory.OrcWarriorFactory;
import br.com.andreluisgomes.abstractfactory.factory.WarriorFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

@RunWith(SpringRunner.class)
public class WarriorFactoryTest {

    @Test
    public void shouldCreateAElfWarrior(){

        WarriorFactory elfWarriorFactory = new ElfWarriorFactory();
        Warrior elf = elfWarriorFactory.createWarrior();

        assertThat(elf, instanceOf(Elf.class));
    }

    @Test
    public void shouldCreateAOrcWarrior(){

        WarriorFactory orcWarriorFactory = new OrcWarriorFactory();
        Warrior orc = orcWarriorFactory.createWarrior();

        assertThat(orc, instanceOf(Orc.class));
    }
}