package com.gigaspaces.demo3_annotation_scan;

import org.springframework.stereotype.Component;

@Component
public class Service2 {
    public Service2() {
        System.out.println("Service2.ctor");
    }
}
