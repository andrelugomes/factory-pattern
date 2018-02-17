package br.com.andreluisgomes.simplefactory;

import br.com.andreluisgomes.simplefactory.domain.Kakarotto;
import br.com.andreluisgomes.simplefactory.domain.Saiyajin;
import br.com.andreluisgomes.simplefactory.domain.Vegeta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by andre on 16/02/18.
 */
@RunWith(SpringRunner.class)
public class SaiyajinFactoryTest {

    @Test
    public void createASaiyajin(){
        Saiyajin vegeta = SaiyajinFactory.withPower(2000L);
        Saiyajin goku = SaiyajinFactory.withPower(20000L);

        assertThat(vegeta).isInstanceOf(Vegeta.class);
        assertThat(vegeta.getPower()).isEqualTo(2000L);

        assertThat(goku).isInstanceOf(Kakarotto.class);
        assertThat(goku.getPower()).isEqualTo(20000L);
    }
}