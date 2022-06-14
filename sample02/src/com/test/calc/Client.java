package com.test.calc;

public class Client {
    public static void main(String[] args) {
        Calculation calc = new Calculation();

        for (int i = 2; i < 10; i++) {
            calc.calc(i);
        }
    }
}
