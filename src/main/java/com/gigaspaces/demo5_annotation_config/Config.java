package com.gigaspaces.demo5_annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

// Classes with @Configuration are scanned with reflection - each method with @Bean generates a bean
@Configuration
// Use @Import to import beans from other @Configuration classes
@Import(Config2.class)
public class Config {
    public Config() {
        System.out.println("Config.ctor");
    }

    @Bean
    public Service getService() {
        return new Service();
    }
}
