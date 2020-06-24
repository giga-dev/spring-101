package com.gigaspaces.demo6_xml_inject_explicit;

import org.springframework.beans.factory.InitializingBean;

public class Service2 implements InitializingBean {
    private SubService subService;

    public Service2() {
        System.out.println("Service2.ctor: ");
    }

    public SubService getSubService() {
        return subService;
    }
    public void setSubService(SubService subService) {
        this.subService = subService;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Service2.afterPropertiesSet: " + subService.doStuff());
    }
}
