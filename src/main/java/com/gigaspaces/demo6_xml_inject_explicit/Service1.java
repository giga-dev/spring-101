package com.gigaspaces.demo6_xml_inject_explicit;

public class Service1 {
    private final SubService subService;

    public Service1(SubService subService) {
        this.subService = subService;
        System.out.println("Service1.ctor: " + subService.doStuff());
    }
}
