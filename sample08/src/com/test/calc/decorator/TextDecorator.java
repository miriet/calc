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

    public String  getContent(String content) {
        return CONTENT + content + CCONTENT + LF;
    }
}