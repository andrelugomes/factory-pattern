package br.com.andreluisgomes.factorylike;

import br.com.andreluisgomes.factorylike.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class DwarfFactoryTest {

    @Autowired
    private DwarfFactory factory;

    @Test
    public void shouldCreateWarriorsOfTypes(){

        Dwarf gnomevil = factory.of("Gnomevil");
        Dwarf lloyd = factory.of("Lloyd");
        Dwarf madTechnomancer = factory.ofOrThrow("MadTechnomancer");
        Dwarf foremanKneebiter = factory.ofOrThrow("Foreman Kneebiter");

        assertThat(gnomevil, instanceOf(Gnomevil.class));
        assertThat(lloyd, instanceOf(Lloyd.class));
        assertThat(madTechnomancer, instanceOf(MadTechnomancer.class));
        assertThat(foremanKneebiter, instanceOf(ForemanKneebiter.class));
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotCreateAWarriorWithUnknownRace(){
        factory.ofOrThrow("UNKNOWN");
    }

}