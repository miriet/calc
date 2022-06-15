package com.test.calc;

public class Calculation {

    public void calc(){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx);
        }
    }
    public void calc(int param) {
        System.out.println(getTitle(param));
        System.out.println(getContent(param));
    }

    private String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += param + " X " + order + " = " + param * order + "\n";
        }
        return result;
    }

    private String getTitle(int param){
        String result = "***** [" + param + "] *****";
        return result;
    }
}
