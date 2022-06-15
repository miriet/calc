package com.test.calc;

public class Calculation {

    private DecoratorIF decorator;
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
        decorator = getDecorator(printType);
        result = decorator.getTitle(param);
        return result;
    }

    private String  getContent(int param, PrintType printType) {
        String result = "";
        decorator = getDecorator(printType);
        for (int order = 1; order < 10; order++) {
            result = decorator.getContent(param);
        }
        return result;
    }

    private DecoratorIF getDecorator(PrintType printType){
        DecoratorIF result = new TextDecorator();
        switch (printType){
            case HTML -> result = new HTMLDecorator();
            case TEXT -> result = new TextDecorator();
            case XML -> result = new XMLDecorator();
        }
        return result;
    }
}
