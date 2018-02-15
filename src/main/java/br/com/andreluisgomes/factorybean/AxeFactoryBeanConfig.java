package br.com.andreluisgomes.factorybean;

import br.com.andreluisgomes.factorybean.domain.Axe;
import br.com.andreluisgomes.factorybean.domain.Hands;
import br.com.andreluisgomes.factorybean.domain.WeaponType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxeFactoryBeanConfig {

    @Bean
    public AxeFactory axeFactory() {
        AxeFactory factory = new AxeFactory();
        factory.setAttack(12);
        factory.setDefense(6);
        factory.setHands(Hands.ONE);
        factory.setType(WeaponType.AXE);
        return factory;
    }

    @Bean(name = "commomAxe")
    public Axe axe() throws Exception {
        return axeFactory().getObject();
    }
}
