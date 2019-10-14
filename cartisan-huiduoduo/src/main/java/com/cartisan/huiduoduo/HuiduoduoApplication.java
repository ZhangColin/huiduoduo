package com.cartisan.huiduoduo;

import com.cartisan.common.utils.SnowflakeIdWorker;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author colin
 */
@SpringCloudApplication
@ComponentScan(basePackages = {"com.cartisan.common", "com.cartisan.huiduoduo"})
@MapperScan("com.cartisan.system.queries")
public class HuiduoduoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HuiduoduoApplication.class);
    }

    @Bean
    public SnowflakeIdWorker idWorker() {
        return new SnowflakeIdWorker(1, 1);
    }

}
