/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

/*
* 객체지향 개발의 세가지 특징
* 1. 캡슐화 (Encapsulation)
*   : 객체의 내부 정보를 외부에서 함부로 접근하거나 수정할 수 없도록 한다. 일반적으로 주어진 목적에 맞는 변수와 메소드들의 묶음을 말하며,
*     외부의 잘못된 접근으로 변수값이 바뀌는 것을 방지하기 위해 기본적으로 모든 변수는 private 으로 선언하고 변수값을 조회/수정할 수 있도록
*     getter, setter 메소드와 특정 결과를 요청하는 일부 메소드만 public 또는 protected 로 선언한다.
*     물론 기본은 private 이지만 상속등의 확장을 위해서는 다른 access modifier(주로 protected) 를 써도 된다.
*
* 2. 상속성 (Inheritance)
*   : 특정 클래스의 모든 자원(변수 및 메소드)을 물려받고, 여기에 추가로 다른 기능을 덧붙이는 것을 상속이라고 하며, extends 예약어를 이용해 정의한다.
*     class ChildClass extends ParentClass { }
*     상속을 통해 중복되는 메소드를 줄이거나, 변경시 부모 클래스만 수정하면 되는 등의 편의성이 있으나 부모 클래스의 캡슐화가 깨지는 문제점이 있으므로
*     메소드를 오버라이드 할 때 주의해야 한다. 또한 부모 클래스라도 private 으로 선언된 변수는 상속되지 않으므로 protected 로 변경해야 한다.
*     자바에서는 C++ 등의 다른 객체지향 언어와 달리 하나의 클래스에서만 상속 받을 수 있는 단일 상속 원칙을 고수하고 있다. 다중 상속과 비슷한 효과를
*     위해서는 인터페이스 들을 추가로 implements 해야 하지만, 이 경우 인터페이스에 정의된 모든 메소드를 재정의 해야한다.
*
* 3. 다형성 (Polymorphism)
*   : 말 그대로 다양한 형태를 가질수 있는 능력이다. A라는 클래스를 상속받은 A1, A2, A3 클래스는 동일한 이름의 메소드를 A로부터 상속받았지만
*     각 클래스의 역할에 따라 다르게 구현할 수 있다(override) 그렇지만 A1, A2, A3를 이용하는 클라이언트에서는 A 타입으로 변수를 선언해서
*     필요에 따라 A1, A2, A3 중 하나를 할당해서 사용하면 하나의 호출방식으로 A1, A2, A3 중 필요한 메소드를 실행할 수 있다.
*
* 추가. Overloading
*   : overriding 은 상속받은 자식 클래스에서 부모 클래스의 메소드를 재정의하는 것이다. overriding과 이름만 비슷한 overloading 이 있는데,
*     overloading 은 동일한 이름의 메소드를 쓰더라도 파라미터의 타입이나 갯수가 달라지면 서로 다른 메소드로 인식하는 것을 말한다.
*     예를 들어 toString(int i), toString(long l), toString(boolean b) 등은 동일한 toString() 이라는 이름으로 여러 개의 메소드를
*     만들었지만 파라미터 타입이 각각 다르게 설정되어 있어서 클라이언트 입장에서는 파라미터 타입에 구애받지 않고 String 으로 변환하고 싶은 데이터는
*     모두 toString([변환하고 싶은 데이터]) 으로 사용하면 된다.
*     일반적으로 파라미터 타입이 다양하거나, 여러개의 파라미터 중에 디폴트 값이 지정되어 있어서 입력 파라미터 갯수가 적은 경우 등에 많이 활용한다.
*
*     * 참고로 절차형 언어들 (C, pascal, basic 등등)은 overloading을 지원하지 않아서 toStringFromInt(), toStringFromLong() 등
*       동일한 기능을 하더라도 파라미터 타입에 따라 다른 함수명을 작성해야 한다.
 */
public class Calculation {

    public void calc(){                     // 오버로딩 1
        for (int idx = 2; idx < 10; idx++) {
            calc(idx);
        }
    }
    public void calc(int param) {           // 오버로딩 2
        System.out.println(getTitle(param));
        System.out.println(getContent(param));
    }
    private String getTitle(int param){
        String result = "***** [" + param + "] *****";
        return result;
    }
    private String  getContent(int param) {
        String result = "";
        for (int order = 1; order < 10; order++) {
            result += param + " X " + order + " = " + param * order + "\n";
        }
        return result;
    }

}
