package org.opentutorials.javatutorials.method;
//잘못된 코드입니다. (예시용)
public class ReturnDemo {
    public static int one() {
        return 1;
        //return 2;//return은 메소드를 종료시키는 역할이므로, return이 처음 나온 이후 구문은 실행되지 않는다.
        //return 3;
    }

    public static void main(String[] args) {
        System.out.println(one());
    }
}
