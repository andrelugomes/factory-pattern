package br.com.andreluisgomes.factorybean;

import br.com.andreluisgomes.factorybean.domain.Axe;
import br.com.andreluisgomes.factorybean.domain.Hands;
import br.com.andreluisgomes.factorybean.domain.WeaponType;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AxeFactoryBeanConfig {

    @Bean(name = "commonAxe")
    public AxeFactory axeFactory() {
        AxeFactory factory = new AxeFactory();
        factory.setAttack(12);
        factory.setDefense(6);
        factory.setHands(Hands.ONE);
        factory.setType(WeaponType.AXE);
        return factory;
    }

    @Bean
    public Axe axe() throws Exception {
        return axeFactory().getObject();
    }

    @Bean(name = "powerfulAxe")
    public AxeFactory powerfulAxe() {
        AxeFactory factory = new AxeFactory();
        factory.setAttack(100);
        factory.setDefense(80);
        factory.setHands(Hands.TWO);
        factory.setType(WeaponType.AXE);
        return factory;
    }
}
