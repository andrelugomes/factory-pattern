package br.com.andreluisgomes.servicelocator;

import org.springframework.beans.factory.config.ServiceLocatorFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceLocatorConfig {

    @Bean
    public ServiceLocatorFactoryBean serviceLocatorBean(){
        ServiceLocatorFactoryBean bean = new ServiceLocatorFactoryBean();
        bean.setServiceLocatorInterface(HobbitFactory.class);
        return bean;
    }
}
