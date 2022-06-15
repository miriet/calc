package com.test.calc;

public class Client {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        if (args.length == 0) {
            calc.calc();
        }else {
            int idx = Integer.parseInt(args[0]);
            calc.calc(idx);
        }
    }
}
