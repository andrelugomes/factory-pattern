package br.com.andreluisgomes.factorybean;

import br.com.andreluisgomes.factorybean.domain.Axe;
import br.com.andreluisgomes.factorybean.domain.Hands;
import br.com.andreluisgomes.factorybean.domain.WeaponType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
public class AxeFactoryTest {

    @Autowired
    private Axe axe;

    @Autowired
    private Axe commonAxe;

    @Autowired
    private Axe powerfulAxe;

    @Test
    public void shouldFactoryAAxe() {

        assertThat(axe.getAttack(), equalTo(12));
        assertThat(axe.getDefense(), equalTo(6));
        assertThat(axe.getHands(), equalTo(Hands.ONE));
        assertThat(axe.getType(), equalTo(WeaponType.AXE));
    }

    @Test
    public void shouldFactoryAPowerfulAxe() {

        assertThat(powerfulAxe.getAttack(), equalTo(100));
        assertThat(powerfulAxe.getDefense(), equalTo(80));
        assertThat(powerfulAxe.getHands(), equalTo(Hands.TWO));
        assertThat(powerfulAxe.getType(), equalTo(WeaponType.AXE));
    }

    @Test
    public void shouldFactoryACommonAxe() {

        assertThat(commonAxe.getAttack(), equalTo(12));
        assertThat(commonAxe.getDefense(), equalTo(6));
        assertThat(commonAxe.getHands(), equalTo(Hands.ONE));
        assertThat(commonAxe.getType(), equalTo(WeaponType.AXE));
    }

}