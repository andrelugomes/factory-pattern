package br.com.andreluisgomes.servicelocator;

import br.com.andreluisgomes.servicelocator.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertThat;

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

        assertThat(frodo, instanceOf(Frodo.class));
        assertThat(sam, instanceOf(Samwise.class));
        assertThat(pippin, instanceOf(Peregrin.class));
        assertThat(merry, instanceOf(Meriadoc.class));
    }

}