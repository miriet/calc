/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;
/*
*   실질적인 HTML 코드를 입히는 getTitle(), getContent()를 별도의 클래스로 분리한다.
*   XML, TEXT 도 동일한 방식으로 분리하며, 다른 포멧을 추가할 때도 비슷한 방식으로 클래스를 생성/추가하면 된다.
* */

class HTMLDecorator {
    public String TABLE = "<table>";
    public String CTABLE = "</table>";
    public String TH = "<th> ";
    public String CTH = " </th>";
    public String TR = "<tr> ";
    public String CTR = " </tr>";
    public String TD = "<td> ";
    public String CTD = " </td>";
    public String LF = "\n";

    String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += TR + TD + param + " X " + order + " = " + param * order + CTD + CTR + LF;
        }
        result += CTABLE;
        return result;
    }

    String getTitle(int param){
        return TABLE + LF + TH + param + CTH + LF;
    }
}