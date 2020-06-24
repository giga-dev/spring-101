package com.gigaspaces.demo5_annotation_config;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demo of spring app with annotation config + configuration
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        DemoUtils.printBeans(applicationContext);

        Service service = applicationContext.getBean(Service.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
