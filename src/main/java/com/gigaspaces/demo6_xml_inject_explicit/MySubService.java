package com.gigaspaces.demo6_xml_inject_explicit;

public class MySubService implements SubService {
    @Override
    public String doStuff() {
        return "MySubService.doStuff()";
    }
}
