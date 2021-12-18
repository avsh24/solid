package com.solid.isp.isp_violation;

public class A {
    private I i;

    public A(I i) {
        this.i = i;
    }

    private void callGetName() {
        System.out.println(i.getName());
    }
}
