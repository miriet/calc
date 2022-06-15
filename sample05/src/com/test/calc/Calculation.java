package com.test.calc;

public class Calculation {

    private HTMLDecorator htmlDecorator = new HTMLDecorator();
    private XMLDecorator xmlDecorator = new XMLDecorator();
    private TextDecorator textDecorator = new TextDecorator();
    public void calc(PrintType printType){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx, printType);
        }
    }
    public void calc(int param, PrintType printType) {
        System.out.println(getTitle(param, printType));
        System.out.println(getContent(param, printType));
    }

    private String getTitle(int param, PrintType printType){
        String result = "";
        switch (printType){
            case HTML -> result = htmlDecorator.getTitle(param);
            case TEXT -> result = textDecorator.getTitle(param);
            case XML ->  result = xmlDecorator.getTitle(param);
        }
        return result;
    }

    private String  getContent(int param, PrintType printType) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            switch (printType){
                case HTML -> result = htmlDecorator.getContent(param);
                case TEXT -> result = textDecorator.getContent(param);
                case XML ->  result = xmlDecorator.getContent(param);
            }
        }
        return result;
    }
}
