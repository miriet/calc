package com.test.calc;

public class Calculation {

    public static void main(String[] args) {
        for (int idx = 2; idx < 10; idx++) {
            System.out.println("***** [" + idx + "] *****");
            for (int order = 1; order < 10; order++) {
                System.out.println(idx + " X " + order + " = " + idx * order);
            }
        }
    }
}
