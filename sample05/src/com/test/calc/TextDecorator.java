package com.test.calc;

class TextDecorator {
    public String TITLE = "***** [";
    public String CTITLE = "] *****";
    public String CONTENT = "*  ";
    public String CCONTENT = "  *";
    public String LF = "\n";

    String  getContent(int param) {
        String result = "";
        String content = "";
        for (int order = 1; order < 10; order++) {
            content = param + " X " + order + " = " + param * order;
            result += CONTENT + content + CCONTENT + LF;
        }
        return result;
    }

    String getTitle(int param ){
        String result = TITLE + param + CTITLE;
        return result;
    }
}