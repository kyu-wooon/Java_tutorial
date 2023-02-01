package org.opentutorials.javatutorials.condition;

public class Condition2Demo {
    public static void main(String[] args) {
        if (false) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
            //then 절 안에 있기에, true일때 나오는 숫자들
        }
        System.out.println(5);
        //true / false에 관계없이 나오는 숫자 5
    }
}
