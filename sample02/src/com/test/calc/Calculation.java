/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

/*
* 클래스의 이름은 그 클래스가 하는 일을 명확히 표현해야 한다.
* 따라서 여러가지 일을 하기 보다는 하나의 일만 하도록 기능 단위별로 클래스를 작성해야 한다.
* 일반적으로 클래스의 이름은 명사를, 메소드의 이름은 동사를 기준으로 작성한다. 이것은 단위업무의 분류(클래스명)와 단위업무에서 해야할 일(메소드명)으로
* 세분화하여 가독성을 높이기 위한 방법이다.
*
* 자바에서는 일반적으로 Camel notation으로 클래스, 메소드, 변수명을 표현한다.
* 이때 클래스는 첫 글자를 대문자로 시작하고, 메소드와 변수명은 소문자로 시작한다. (일반적 관례. 안 지켜도 실행되지만 가독성 저하됨)
* Camel notation 은 오픈소소 진영의 de-facto standard 로, 스프링을 비롯한 많은 오픈소스 프로젝트에서 준수하고 있으며,
* 일부 오픈소스에서는 camel notation으로 코드가 작성되었음을 전제로 가정하고
* 여러가지 기능들을 부여하고 있다. (예를 들면 DTO bean 에 값을 저장해 줄때 getter/setter를 자동설정하는 경우 등)
*
* 단, 상수로 지정하는 값(static final)은 전체 대문자 및 underscore notation으로 표기한다.
* ex. public static final float SPEED_OF_LIGHT = 2.99792458*10^8;
*
* *.java 파일 하나에 여러개의 클래스를 정의할 수는 있지만 public 클래스는 java 파일 하나당 한개만 생성되어야 한다.
* 그리고 public 클래스의 이름과 .java 파일의 이름이 같아야 한다. 리팩토링이나 콘솔에서 vi 등으로 직접 클래스를 만들때 주의해야 한다.
*
* */
public class Calculation {

    public void calc(){
        for (int idx = 2; idx < 10; idx++) {
            calc(idx);
        }
    }
    public void calc(int param) {
        System.out.println("***** [" + param + "] *****");
        for (int order = 1; order < 10; order++) {
            System.out.println(param + " X " + order + " = " + param * order);
        }
    }
}
