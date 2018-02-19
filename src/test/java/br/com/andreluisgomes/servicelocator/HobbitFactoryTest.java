package br.com.andreluisgomes.servicelocator;

import br.com.andreluisgomes.servicelocator.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
@RunWith(SpringRunner.class)
public class HobbitFactoryTest {

    @Autowired
    private HobbitFactory factory;

    @Test
    public void shouldCreateHobbitisByName(){

        Hobbit frodo = factory.getHobbit("frodo");
        Hobbit sam = factory.getHobbit("samwise");
        Hobbit pippin = factory.getHobbit("peregrin");
        Hobbit merry = factory.getHobbit("meriadoc");

        assertThat(frodo).isExactlyInstanceOf(Frodo.class);
        assertThat(sam).isExactlyInstanceOf(Samwise.class);
        assertThat(pippin).isExactlyInstanceOf(Peregrin.class);
        assertThat(merry).isExactlyInstanceOf(Meriadoc.class);
    }

}