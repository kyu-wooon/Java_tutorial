package org.opentutorials.javatutorials.scope;

public class ScopeDemo2 {
    static int i; // 클래스 변수 선언

    static void a() {
        i = 0; //4행의 변수 i를 의미
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) { //4행의 변수 i를 의미
            a(); //여기에서 변수 i가 0이 되어버림
            System.out.println(i); // 0 출력
        }
    }

}