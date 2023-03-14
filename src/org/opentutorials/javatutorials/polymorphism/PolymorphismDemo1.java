package org.opentutorials.javatutorials.polymorphism;

class A{
    public String x(){return "A.x";}
}
class B extends A{// B가 A를 상속
    public String x(){return "B.x";}
    public String y(){return "y";}
}
class B2 extends A{//B2가 A를 상속
    public String x(){return "B2.x";}
}
public class PolymorphismDemo1 {
    public static void main(String[] args) {
        A obj = new B(); //B가 A의 형태로 변환
        A obj2 = new B2(); //B2가 A의 형태로 변환
        System.out.println(obj.x()); //B.x 출력
        System.out.println(obj2.x()); //B2.x출력
    }
}