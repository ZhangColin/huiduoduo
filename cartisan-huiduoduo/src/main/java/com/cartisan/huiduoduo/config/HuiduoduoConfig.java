package com.cartisan.huiduoduo.config;

import com.cartisan.common.repositories.CartisanRepositoryFactoryBean;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author colin
 */
@Configuration
@EnableJpaRepositories(basePackages = {"com.cartisan.huiduoduo"},
        repositoryFactoryBeanClass = CartisanRepositoryFactoryBean.class)
@EntityScan(basePackages = {"com.cartisan.huiduoduo"})
public class HuiduoduoConfig {
}
