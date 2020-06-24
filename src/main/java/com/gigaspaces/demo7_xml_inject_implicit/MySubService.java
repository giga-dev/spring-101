package com.gigaspaces.demo7_xml_inject_implicit;

public class MySubService implements SubService {
    @Override
    public String doStuff() {
        return "MySubService.doStuff()";
    }
}
