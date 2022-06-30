/*
 * Copyleft (c) 2022. Test codes written by miriet.
 * 많이 보고, 많이 만들고, 많이 디버깅하자!!!
 */

package com.test.calc;

public class Calculation {

/*
    자바에서 사용하는 모든 변수, 메소드, 객체 등은 모두 JVM의 메모리 상에서 실행된다. 너무 당연한 소리다.
    JVM의 메모리 영역은 크게 세가지로 나뉜다.
    1. static 영역
        static으로 선언된 모든 변수, 메소드 들이 로딩된다.
        static 영역은 JVM 이 시작될때 (java 명령어로 실행하든 톰캣을 실행하든, 스프링부트 앱을 실행하든...여하튼 자바 어플리케이션이 실행될 때)
        실행할 대상 프로그램 패키지의 모든 static 요소를 다 스캔해서 static 영역에 올려둔다.
        static 으로 선언한 변수, 메소드는 프로그램 시작부터 종료까지 계속 static 영역에 상주하게 된다.
    2. stack 영역
        각 메소드나 클래스에서 선언하는 primitive type (int, boolean, double 등) 변수의 값들이 저장되는 영역이다
        primitive type은 자바의 객체(인스턴스)가 아니므로 stack 영역에서 별도로 관리한다.
        stack 으로 되어 있어서 변수값을 바꿀때마다 새로운 값이 stack 의 최 상단에 들어가므로 변수값을 참조할 때 최근에 업데이트된 값을 가져오게 된다.
        또한 인스턴스 객체에 대한 레퍼런스 (주소값) 도 stack 영역에 저장된다.
        String s = new String("Korea"); 라면 "Korea" 라는 문자열 인스턴스는 Heap에 생성되고, 그 heap 메모리의 번지수가 static 영역의
        변수 s 에 저장된다.
    3. Heap 영역
        우리가 쓰는 대부분의 자바 코드들... new 를 이용해서 생성하는 모든 객체의 인스턴스는 heap 영역에 생성된다.
        static과 primitive 값, 변수선언된 주소값을 제외한 모든 객체들이 여기에 생성된다. 즉, 대부분의 자바 어플리케이션은 heap 메모리에서
        구동된다고 봐도 무방하다.
        heap의 메모리 주소는 stack 의 변수가 가지고 있는데, stack에 연결된 변수가 없는 heap메모리상의 인스턴스는 더이상 참조하는 변수가
        없다고 보고 jvm 이 heap 메모리에서 삭제한다. <- 이걸 가비지 콜렉션 이라고 부른다.
*/

    /*
    * main 함수는 자바 공부의 가장 처음에 만나는 함수이다.
    * 형식은 항상 public static void 로 선언하며, 파라미터를 받기 위해 스트링 배열 String[] args 를 선언해둔다.
    * 커멘드창에서
    * java Calculation.class param1, param2
    * 라고 치면 Calculation.class 의 main 함수를 호출하면서 args[0] = param1, args[1] = param2 로 파라미터를 넘겨주게 된다.
    * java 명령으로 jvm이 구동될 때 바로 실행가능하도록 로딩되어야 하므포 (new Calculation() 을 해 줄 놈이 없으므로)
    * main() 함수는 항상 static으로 선언해서 vm 구동과 함께 static영역에 로딩되어 실행되게 된다.
    * 따라서 main 함수 내부에 선언되는 로컬 변수들도 모두 static 으로 선언되어야 하면, 그렇지 않은 경운 main 내부에서
    * Calculation calc = new Calculation();
    * calc.calc();
    * 처럼 자신의 인스턴스를 생성 (new) 하고 다른 메소드들을 실행시키면 된다.
    * main 함수를 실행시키는 것은 패키지 외부의 vm에서 하는거니까 접근자(access modifier)는 반드시 public으로 선언되어야 한다.
    * 그리고 프로그램이 종료되면 그냥 끝나기 때문에 main 의 return 타입은 항상 void 로 설정한다.
    * */
    public static void main(String[] args) {
        // 2중 루프... 2단, 3단.....
        for (int idx = 2; idx < 10; idx++) {
            System.out.println("***** [" + idx + "] *****"); // 구구단 몇단인지 타이틀 출력
            // 2중 루프 두번쨰. 실제 계산하고 구구단 출력
            for (int order = 1; order < 10; order++) {
                System.out.println(idx + " X " + order + " = " + idx * order);  // 실제 구구단 내용을 출력
            }
        }
    }
}
