package com.gigaspaces.demo3_annotation_scan;

//This service is not detected because it's not annotated with @Component
public class Service3 {
    public Service3() {
        System.out.println("Service3.ctor");
    }
}
