package org.opentutorials.javatutorials.generic.implements_generic;

interface Info{
    int getLevel();
}
class EmployeeInfo implements Info{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
    public int getLevel(){
        return this.rank;
    }
}
class Person<T extends Info>{
    public T info;
    Person(T info){ this.info = info; }
}
public class GenericDemo {
    public static void main(String[] args) {
        Person p1 = new Person(new EmployeeInfo(1));
        //Person<String> p2 = new Person<String>("부장"); // Person의 T는 Info인터페이스나 그 자식 외에는 올 수 없다.
    }
}
