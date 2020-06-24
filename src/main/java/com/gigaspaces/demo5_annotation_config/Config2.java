package com.gigaspaces.demo5_annotation_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {
    public Config2() {
        System.out.println("Config2.ctor");
    }
    @Bean
    Service2 getService2() {
        return new Service2();
    }
}
