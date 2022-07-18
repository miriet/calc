/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

/*
*   정해진 갯수의 열거형 데이터를 묶어서 표현할 때 enum 을 사용하면 편리하다.
*   Enum은 객체로 정의하지만 생성자가 private 으로 되어 있어서 new 로 생성할 수 없고 상속도 되지 않는다.
*   대신, enum 의 각 엘리먼트들을 static 변수 접근하듯이 취급하면 된다.
*   Enum 을 사용하면 코드의 가독성이 올라가고 열거형 데이터의 종류와 의도를 명확하게 표현할 수 있다.
* */
public enum PrintType {
    TEXT, HTML, XML
}
