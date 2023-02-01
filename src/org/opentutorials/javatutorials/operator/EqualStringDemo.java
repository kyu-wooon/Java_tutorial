package org.opentutorials.javatutorials.operator;

public class EqualStringDemo {
    public static void main(String[] args) {
        String a = "Hello world";
        String b = new String("Hello world");
        System.out.println(a == b); //false
        System.out.println(a.equals(b)); // .equals은 문자열을 비교할 때 사용하는 메소드.
    }
}
