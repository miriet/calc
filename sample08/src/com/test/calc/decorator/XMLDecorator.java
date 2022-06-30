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

    public String  getContent(String  content) {
        return CONTENT + content + CCONTENT + LF;
    }
}