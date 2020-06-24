package com.gigaspaces.demo2_annotation;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demo of very simple spring app with annotation config
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Service.class);
        DemoUtils.printBeans(applicationContext);

        Service service = applicationContext.getBean(Service.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
