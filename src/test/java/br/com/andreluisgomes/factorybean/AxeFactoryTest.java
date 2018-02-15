package br.com.andreluisgomes.factorybean;

import br.com.andreluisgomes.factorybean.domain.Axe;
import br.com.andreluisgomes.factorybean.domain.Hands;
import br.com.andreluisgomes.factorybean.domain.WeaponType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AxeFactoryTest {

    @Autowired
    @Qualifier("commomAxe")
    private Axe axe;

    @Test
    public void shouldFactoryACommonAxe() throws Exception {

        assertThat(axe.getAttack(), equalTo(12));
        assertThat(axe.getDefense(), equalTo(6));
        assertThat(axe.getHands(), equalTo(Hands.ONE));
        assertThat(axe.getType(), equalTo(WeaponType.AXE));
    }

}