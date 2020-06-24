package com.gigaspaces;

import org.springframework.context.ApplicationContext;

public class DemoUtils {
    public static void printBeans(ApplicationContext applicationContext) {
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("Beans: " + beanDefinitionNames.length);
        for (String beanDefinitionName : beanDefinitionNames) {
            Object bean = applicationContext.getBean(beanDefinitionName);
            System.out.println("* " + beanDefinitionName + " => " + bean);
        }
        System.out.println();
    }
}
