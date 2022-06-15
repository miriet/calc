package com.test.calc;

public class Calculation {

    private static String TABLE = "<table>";
    private static String CTABLE = "</table>";
    private static String TH = "<th> ";
    private static String CTH = " </th>";
    private static String TR = "<tr> ";
    private static String CTR = " </tr>";
    private static String TD = "<td> ";
    private static String CTD = " </td>";

    private static String TITLE = "<TITLE> ";
    private static String CTITLE = " </TITLE>";
    private static String CONTENT = "<CONTENT> ";
    private static String CCONTENT = " </CONTENT>";
    private static String LF = "\n";

    public void calc(PrintType printType){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx, printType);
        }
    }
    public void calc(int param, PrintType printType) {
        System.out.println(getTitle(param, printType));
        System.out.println(getContent(param, printType));
    }

    private String  getContent(int param, PrintType printType) {
        String result = "";
        String content = "";
        for (int order = 1; order < 10; order++) {
            content = param + " X " + order + " = " + param * order;
            switch (printType){
                case XML -> result += CONTENT + content + CCONTENT + LF;
                case HTML -> result += TR + TD + content + CTD + CTR + LF;
                case TEXT -> result += content + LF;
            }
        }
        if(printType == PrintType.HTML) result += CTABLE;
        return result;
    }

    private String getTitle(int param, PrintType printType){
        String result = "";
        String title = "***** [" + param + "] *****";
        switch (printType){
            case XML -> result = TITLE + title + CTITLE;
            case HTML -> result = TABLE + LF + TH + title + CTH + LF;
            case TEXT -> result = title;
        }
        return result;
    }
}
