/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;
/*
*   sample05에서 각 출력포멧별로 클래스를 분리하고 Calculation 에서 인스턴스를 생성했는데
*   이 부분들을 출력포멧용 클래스의 관리(생성 및 사용)를 전담하는 메소드를 만들어 분리한다.
*   각 출력용 클래스들은 동일한 메소드를 공통의 인터페이스를 기반으로 정의해서, 해당 메소드를 사용하는
*   곳(Calculation.getTitle(), Calculation.getContent() )에서는 출력 포멧의 타입에 상관없이
*   동일한 메소드를 호출하여 Decorator 클래스의 종류에 상관없이 getTitle(), getContent() 를
*   실행할 수 있게 된다. (느슨한 결합, 변화에 열려있슴)
* */
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
        decorator = getDecorator(printType);            // Decorator 클래스가 늘어나더라도 PrintType enum 에만 타입 추가하면 됨
        result = decorator.getTitle(param);             // 출력포멧이 추가되거나 변경되더라도 Caculation 클래스는 getDecorator()만
        return result;                                  // 수정하면 됨 (변할 수 있는 부분을 getDecorator()에 응집시켜 별도로 분리할 예정)
    }

    private String  getContent(int param, PrintType printType) {
        String result = "";
        decorator = getDecorator(printType);
        for (int order = 1; order < 10; order++) {
            result = decorator.getContent(param);
        }
        return result;
    }

    /*
    *   PrintType에 따라 실제 필요한 Decorator를 생성하는 로직을 별도의 메소드로 분리시키면 응집도가 높아지고,
    *   필요에 따라 해당 부분을 별도의 클래스로 분리하여 Caculation 의 역할(계산)이 아닌 일(출력포멧 판단)을 분리할 수 있다.
    * */
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
