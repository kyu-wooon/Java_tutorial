package org.opentutorials.javatutorials.constant2;

class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class ConstantDemo5 {

    public static void main(String[] args) {
//        if(Fruit.APPLE == Company.APPLE)
//        {
            System.out.println("과일 애플과 회사 애플이 같다.");
//        }
    }
}
