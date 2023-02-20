package org.opentutorials.javatutorials.scope;

public class ScopeDemo3 {
    static int i;

    static void a() {
        int i = 0; //변경된 부분
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {
            a();
            System.out.println(i);
        }
    }

}