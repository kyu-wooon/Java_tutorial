package org.opentutorials.javatutorials.variables;

public class VariableDemo {
    public static void main(String[] args){
        //변수가 없는 경우
        System.out.println(100 + 10);
        System.out.println((100 + 10) / 10);
        System.out.println(((100 + 10) / 10) - 10);
        System.out.println((((100 + 10) / 10) - 10) * 10);

        //변수를 설정한 경우
        int a = 100;
        System.out.println(a + 10);
        System.out.println((a+ 10) / 10);
        System.out.println(((a + 10) / 10) - 10);
        System.out.println((((a + 10) / 10) - 10) * 10);
    }
}
