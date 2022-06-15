package com.test.calc.decorator;

public class TextDecorator implements DecoratorIF {
    public String TITLE = "***** [";
    public String CTITLE = "] *****";
    public String CONTENT = "*  ";
    public String CCONTENT = "  *";
    public String LF = "\n";

    public String getTitle(int param){
        String result = TITLE + param + CTITLE;
        return result;
    }

    public String  getContent(int param) {
        String result = "";
        String content = "";
        for (int order = 1; order < 10; order++) {
            content = param + " X " + order + " = " + param * order;
            result += CONTENT + content + CCONTENT + LF;
        }
        return result;
    }
}