package com.gigaspaces.demo4_xml_scan;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo of spring app with xml config + package scanning
 * Note that Service is annotated with @Component to be detectable
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo4.xml");
        DemoUtils.printBeans(applicationContext);

        Service service = applicationContext.getBean(Service.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
