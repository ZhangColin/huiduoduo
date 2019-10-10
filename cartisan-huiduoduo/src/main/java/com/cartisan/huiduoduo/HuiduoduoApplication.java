package com.cartisan.huiduoduo;

import com.cartisan.common.utils.IdWorker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * @author colin
 */
@SpringBootApplication(scanBasePackages = {"com.cartisan.common", "com.cartisan.system", "com.cartisan.huiduoduo"})
public class HuiduoduoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HuiduoduoApplication.class);
    }

    @Bean
    public IdWorker idWorker() {
        return new IdWorker(1, 1);
    }

}
