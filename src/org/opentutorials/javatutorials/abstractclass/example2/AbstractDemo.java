package org.opentutorials.javatutorials.abstractclass.example2;

abstract class A{
    public abstract int b();
    public void d(){
        System.out.println("world");
    }
}
//추상클래스 A를 상속, 추상 메소드 b를 오버라이드
class B extends A{
    public int b(){return 1;}
}
public class AbstractDemo {
    public static void main(String[] args) {
        B obj = new B();
        System.out.println(obj.b());
    }
}