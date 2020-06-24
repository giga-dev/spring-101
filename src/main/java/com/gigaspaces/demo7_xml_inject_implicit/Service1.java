package com.gigaspaces.demo7_xml_inject_implicit;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

public class Service1 implements InitializingBean {

    @Resource
    //@Autowired
    private SubService subService;

    public Service1() {
        System.out.println("Service1.ctor");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service1.afterPropertiesSet: " + subService.doStuff());
    }

    /* @PostConstruct can be used instead of InitializingBean
    @PostConstruct
    public void onPostConstruct() {
        System.out.println("Service1.onPostConstruct: " + subService.doStuff());
    }
     */
}
