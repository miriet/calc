package com.test.calc;

import com.test.calc.common.PrintType;

public class Client {
    public static void main(String[] args) {
        PrintType printType = PrintType.HTML;
        Calculation calc = new Calculation();
        if (args.length == 0) {
            calc.calc(printType);
        }else {
            int idx = Integer.parseInt(args[0]);
            calc.calc(idx, printType);
        }
    }
}
