package org.opentutorials.javatutorials.scope;


class C2 {
    int v = 10;

    void m() {
        int v = 20; //변수 선언
        System.out.println(v);
    }
}

public class ScopeDemo8 {

    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }

}