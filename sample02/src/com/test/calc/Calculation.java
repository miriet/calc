package com.test.calc;

public class Calculation {

    public void calc(int param) {
        System.out.println("***** [" + param + "] *****");
        for (int j = 1; j < 10; j++) {
            System.out.println(param + " X " + j + " = " + param*j);
        }
    }
}
