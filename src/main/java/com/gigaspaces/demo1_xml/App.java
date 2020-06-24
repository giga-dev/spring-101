package com.gigaspaces.demo1_xml;

import com.gigaspaces.DemoUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Demo of very simple spring app with xml config
 *
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("demo1.xml");

        DemoUtils.printBeans(applicationContext);

        Service service = applicationContext.getBean("foo", Service.class);
        System.out.println("getBean(Service.class): " + service);
    }
}
