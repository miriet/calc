package com.test.calc;

/*
 *   실질적인 HTML 코드를 입히는 getTitle(), getContent()를 별도의 클래스로 분리한다. (HTMLDecorator)
 *   XML, TEXT 도 동일한 방식으로 분리하며, 다른 포멧을 추가할 때도 비슷한 방식으로 클래스를 생성/추가하면 된다.
 *
 *   HTMLDecorator, XMLDecorator, TextDecorator 의 getTitle(), getContent() 를 인터페이스로 묶고, 런타임에 어느 클래스를 생성할 지
 *   판단하게 되면 printType 에 따라 적절한 클래스의 getTitle(), getContent() 를 호출할 수 있게 된다.
 * */

class HTMLDecorator implements DecoratorIF {
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