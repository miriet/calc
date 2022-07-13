/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

/*
* 객체지향 개발의 5가지 핵심원리
* 1. SRP (Single Resopnsibility Principle: 단일 책임의 원칙)
*   : 단일 클래스는 오직 한 가지 일에만 책임이 있어야 한다. 즉, 한가지 일만 처리하도록 설계되어야 한다.
*     하나의 클래스가 하나 이상의 책임을 갖는 것을 결합(Coupled)이라고 한다. 이 경우, 하나의 책임에 대한 변경은 다른 책임의 수정을 발생시킬 수 있다.
*     책임(기능)의 결합을 최대한 낮춘 형태를 느슨한 결합 (loosely coupled) 이라고 한다.
*     클래스도 한 가지 일에만 책임을 갖도록 설계해야 하며, 메소드도 한가지 기능만 수행하도록 최대한 기능을 나눠야 한다.
*     SRP에 충실할수록 가독성 향상, 소스 수정에 따른 부가적인 오류발생 감소, 테스트 케이스 작성 쉬워짐 -> 테스트 자동화 용이함 등 다양한 장점을
*     기대할 수 있다.
*
* 2. OCP (Open-Closed Principle: 열림-닫힘 원칙)
*   : 소프트웨어 엔티티(클래스, 모듈, 함수)는 확장을 위해 열려있고, 외부의 변화/접근/조작에는 닫혀있어야 한다.
*     쉽게 말해서 기능 확장은 쉽게 하되 다른 모듈의 변화나 접근에 의해 변경되지 않도록 설계해야 한다.
*     예를 들어 if-else 또는 switch-case로 파라미터 받은 객체에 어떤 일을 시키는 경우, if문에서 로직을 처리하지 말고 파라미터 객체에 할 일들을
*     정의해 둔 뒤에 해당 메소드를 호출하도록 하면 파라미터 객체의 종류가 늘어나더라도 소스를 수정할 필요가 없게 된다.
*     기능확장은 주로 인터페이스나 추상클래스를 이용한 추상레이어를 작성함으로서 기능이나 대상의 확장/추가를 반영한다.
*
* 3. LSP (Liskov's Substitution Principle)
*   : 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 행위는 수행할 수 있어야 한다.
*     상속관계에서 자식 클래스는 최소한 자신의 부모 클래스에서 가능한 기능들은 모두 실행되어야 한다. 자식 클래스에서 재정의(override) 한 메소드에 의해
*     부모 클래스의 특정 메소드가 오작동 하는 등의 문제가 있어서는 안된다.
*     문제가 생기는 경우, 상속관계를 없애고 자식 클래스를 새롭게 작성하거나 오작동하는 부모 클래스의 메소드를 찾아 자식 클래스에서 재정의해야 한다.
*
* 4. ISP (Interface Segregation Principle: 인터페이스 분리의 원칙)
*   : 클래스를 만들 때, 사용하지 않는 인터페이스는 구현하지 말아야 한다.
*     A ~ F 까지 6개의 메소드를 갖는 클래스 1을 여러 다른 클래스(클라이언트)에서 사용하는 경우, A, B 를 사용하는 클래스 2,3을 위해
*     인터페이스 G를, D,E,F를 사용하는 클래스 3,4,5를 위해 인터페이스 H를 만들어 준다. 각 클라이언트의 사용에 맞게 최소화된 인터페이스를 구현한다.
*
* 5. DIP (Dependency Inversion Principle: 의존성 역전의 원칙)
*   : 클래스 간의 연결관계를 최대한 느슨하게(Loosely coupled) 만들기 위해 인스턴스 생성을 클래스 외부 (주로 프레임웍)에 넘기고, 종속성을 구체적인
      객체 대신 추상적인 인터페이스를 이용하여 정의한다.
      A클래스를 멤버 변수로 갖는 B클래스에서 A를 명시적으로 지정 ( private A a = new A(); )하기보다 A의 추상형 인터페이스 A'를 지정한다.
      ( prvate A' a = new A(); )
      이렇게 하면 변수 a 에 A() 의 인스턴스를 할당할 수도 있지만, A'를 상속(또는 implements)한 AA() 를 할당할 수도 있는 유연성을 확보하게 된다.
      여기서 한걸음 더 나아가 private A' a; 형태로 인터페이스 타입만 선언해두고, 실제 생성은 (new A() 또는 new AA() ) 프레임웍이나 WAS 등
      A의 외부 환경에 위임해서 프레임웍이 A'의 구현체를 조건에 맞게 생성하도록 하는 것을 Dependency Injection 또는 Inversion of Control
      이라고 한다. 대표적인 IoC / DI 프레임웍으로는 Spring framework 이 있다.
 */
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
