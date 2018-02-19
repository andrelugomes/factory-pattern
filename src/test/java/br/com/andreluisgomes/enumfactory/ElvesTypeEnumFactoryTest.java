package br.com.andreluisgomes.enumfactory;

import br.com.andreluisgomes.enumfactory.domain.DarkElves;
import br.com.andreluisgomes.enumfactory.domain.Elves;
import br.com.andreluisgomes.enumfactory.domain.LightElves;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
public class ElvesTypeEnumFactoryTest {

    @Test
    public void shouldCreateALightElfFromType(){

        Elves elves = ElvesTypeEnumFactory.LIGHT.createElves();

        assertThat(elves).isExactlyInstanceOf(LightElves.class);
    }

    @Test
    public void shouldCreateADarkElfFromType(){

        Elves elves = ElvesTypeEnumFactory.DARK.createElves();

        assertThat(elves).isExactlyInstanceOf(DarkElves.class);
    }
}