package org.opentutorials.javatutorials.condition;

public class ElseDemo {
    public static void main(String[] args) {
        if (false){
            System.out.println(1); //첫번째는 false라 실행되지 않음
        } else if (true) {
            System.out.println(2); // 두번째가 true라 실행됨
        } else if (true) {
            System.out.println(3);
        } else {
            System.out.println(4); //3번째, 4번재는 건너뛰어짐
        }
        System.out.println("END"); //if문을 빠져나온 후 실행
    }
}
