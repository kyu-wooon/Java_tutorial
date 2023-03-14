package org.opentutorials.javatutorials.polymorphism;

interface I2{
    public String A();
}
interface I3{
    public String B();
}
class D implements I2, I3{
    public String A(){
        return "A";
    }
    public String B(){
        return "B";
    }
}
public class PolymorphismDemo3 {
    public static void main(String[] args) {
        D obj = new D();
        I2 objI2 = new D();
        I3 objI3 = new D();

        obj.A();
        obj.B();

        objI2.A();
        //objI2.B(); //데이터 타입이 I2 이기 떄문에 B를 호출할 수 없다.

        //objI3.A(); //데이터타입이 I3이기 때문에 A를 호출할 수 없다.
        objI3.B();
    }
}