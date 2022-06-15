package com.test.calc;

public class Calculation {

    public void calc(){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx);
        }
    }
    public void calc(int param) {
        System.out.println("***** [" + param + "] *****");
        for (int order = 1; order < 10; order++) {
            System.out.println(param + " X " + order + " = " + param * order);
        }
    }
}
