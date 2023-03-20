package org.opentutorials.javatutorials.progenitor;

class Student2 implements Cloneable{ //clon이 가능함을 알기리 위해 구현
    String name;
    Student2(String name){
        this.name = name;
    }
    protected Object clone() throws CloneNotSupportedException{ //예외를 throw
        return super.clone();
    }
}

class ObjectDemo2 {

    public static void main(String[] args) {
        Student2 s1 = new Student2("egoing");
        try { //clone 예외 처리
            Student2 s2 = (Student2)s1.clone();
            System.out.println(s1.name);
            System.out.println(s2.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}