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

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)
public class WarriorFactoryTest {

    @Test
    public void shouldCreateAElfWarriorByFactoryMethod(){

        WarriorFactory elfWarriorFactory = new ElfWarriorFactory();
        Warrior elf = elfWarriorFactory.createWarrior();

        assertThat(elf).isInstanceOf(Elf.class);
        assertThat(elf.battleCry()).isNotBlank();
    }

    @Test
    public void shouldCreateAOrcWarriorByFactoryMethod(){

        WarriorFactory orcWarriorFactory = new OrcWarriorFactory();
        Warrior orc = orcWarriorFactory.createWarrior();

        assertThat(orc).isInstanceOf(Orc.class);
        assertThat(orc.battleCry()).isNotBlank();
    }
}