package com.gigaspaces.demo3_annotation_scan;

import org.springframework.stereotype.Component;

@Component
public class Service {
    public Service() {
        System.out.println("Service.ctor");
    }
}
