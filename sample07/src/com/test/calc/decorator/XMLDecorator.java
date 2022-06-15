package com.test.calc.decorator;

public class XMLDecorator implements DecoratorIF {
    public String TITLE = "<TITLE> ";
    public String CTITLE = " </TITLE>";
    public String CONTENT = "<CONTENT> ";
    public String CCONTENT = " </CONTENT>";
    public String LF = "\n";

    public String getTitle(int param){
        return TITLE + param + CTITLE;
    }

    public String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += CONTENT + param + " X " + order + " = " + param * order + CCONTENT + LF;
        }
        return result;
    }
}