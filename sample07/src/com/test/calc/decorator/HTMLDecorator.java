package com.test.calc.decorator;

public class HTMLDecorator implements DecoratorIF {
    public String TABLE = "<table>";
    public String CTABLE = "</table>";
    public String TH = "<th> ";
    public String CTH = " </th>";
    public String TR = "<tr> ";
    public String CTR = " </tr>";
    public String TD = "<td> ";
    public String CTD = " </td>";
    public String LF = "\n";

    @Override
    public String getTitle(int param){
        return TABLE + LF + TH + param + CTH + LF;
    }

    @Override
    public String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += TR + TD + param + " X " + order + " = " + param * order + CTD + CTR + LF;
        }
        result += CTABLE;
        return result;
    }
}