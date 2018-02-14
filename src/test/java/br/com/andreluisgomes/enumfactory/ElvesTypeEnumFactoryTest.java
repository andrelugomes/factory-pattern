package br.com.andreluisgomes.enumfactory;

import br.com.andreluisgomes.enumfactory.domain.DarkElves;
import br.com.andreluisgomes.enumfactory.domain.Elves;
import br.com.andreluisgomes.enumfactory.domain.LightElves;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
public class ElvesTypeEnumFactoryTest {

    @Test
    public void shouldCreateALightElfFromType(){

        Elves elves = ElvesTypeEnumFactory.LIGHT.createElves();

        assertThat(elves, instanceOf(LightElves.class));
    }

    @Test
    public void shouldCreateADarkElfFromType(){

        Elves elves = ElvesTypeEnumFactory.DARK.createElves();

        assertThat(elves, instanceOf(DarkElves.class));
    }
}