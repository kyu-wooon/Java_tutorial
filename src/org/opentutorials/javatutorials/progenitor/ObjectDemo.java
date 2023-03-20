package org.opentutorials.javatutorials.progenitor;

class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student _obj = (Student)obj; //명시적 형변환
        return name == _obj.name;
    }
}

class ObjectDemo {

    public static void main(String[] args) {
        Student s1 = new Student("egoing");
        Student s2 = new Student("egoing");
        System.out.println(s1 == s2); //서로 다른 객체이므로 false
        System.out.println(s1.equals(s2)); //논리적으로는 같은 값을 가지므로 재정의

    }

}
