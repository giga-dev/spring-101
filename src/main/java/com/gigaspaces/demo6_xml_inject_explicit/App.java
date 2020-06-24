package com.gigaspaces.demo6_xml_inject_explicit;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo of very simple spring app with xml config
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo6.xml");

        DemoUtils.printBeans(applicationContext);

        Service1 service = applicationContext.getBean(Service1.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
