package com.test.calc;

class XMLDecorator {
    public String TITLE = "<TITLE> ";
    public String CTITLE = " </TITLE>";
    public String CONTENT = "<CONTENT> ";
    public String CCONTENT = " </CONTENT>";
    public String LF = "\n";

    String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += CONTENT + param + " X " + order + " = " + param * order + CCONTENT + LF;
        }
        return result;
    }

    String getTitle(int param ){
        return TITLE + param + CTITLE;
    }
}