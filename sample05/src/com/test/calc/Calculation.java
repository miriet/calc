/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

/*
*   하나의 객체는 최대한 하나의 역할만 수행할 수 있도록 조정되어야 한다 (Single Responsibility Principle)
*   여기서는 계산을 하는 기능과 파라미터에 따라 출력형태를 판단하는 기능, 출력형태(라인별)를 만드는 기능이 존재한다.
*   각 기능들을 별도의 클래스로 분리하면 시스템의 복잡도가 증가하지만, 클래스 간의 결합이 느슨해져서 추가적인 기능 변화에 보다 유연하게 대응할 수 있다.
*
*   Decorator 패턴은 유사한 기능들을 정의해두고 필요에 따라 조합해서 쓸 수 있도록 해야 하는 경우에 유용한 디자인 패턴이다.
*   여기서는 Decorator 패턴을 적용하지 않았지만 속성을 중첩해야 하는 경우에 (예를 들어 xml 테그를 적용한 형태의 결과에 다시 HTML 테그를 덧붙이기)
*   사용되곤 한다. 태그를 붙이는 것보다는 텍스트의 속성 (특정 문자를 볼드로 지정하고 크기를 바꾸고 배경색을 변경하는 등)을 변경시키는 부분 등에서 많이
*   사용된다.
* */
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
