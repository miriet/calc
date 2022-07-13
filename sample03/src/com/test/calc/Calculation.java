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
*/
public class Calculation {

    public void calc(){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx);
        }
    }
    public void calc(int param) {
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
