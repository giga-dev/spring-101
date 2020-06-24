package com.gigaspaces.demo3_annotation_scan;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Demo of spring app with annotation config + package scanning
 * Note that Service is annotated with @Component to be detectable
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.gigaspaces.demo3_annotation_scan");
        DemoUtils.printBeans(applicationContext);

        Service service = applicationContext.getBean(Service.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
