package br.com.andreluisgomes.abstractfactory;

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
public class DwarfFactoryTest {

    @Test
    public void shouldCreateAElfWarrior(){

        WarriorFactory elfWarriorFactory = new ElfWarriorFactory();
        Warrior elf = elfWarriorFactory.createWarrior();

        assertThat(elf, instanceOf(Warrior.class));
    }

    @Test
    public void shouldCreateAOrcWarrior(){

        WarriorFactory orcWarriorFactory = new OrcWarriorFactory();
        Warrior orc = orcWarriorFactory.createWarrior();

        assertThat(orc, instanceOf(Warrior.class));
    }
}