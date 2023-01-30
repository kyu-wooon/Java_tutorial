package org.opentutorials.javatutorials.constant;

public class ConstantDemo {
    public static void main(String[] args) {
        //int a = 2.2; //int형 변수여서 실수형 상수를 지정할 수 없음
        //float a = 2.2; // 여전히 타입 미스매치 발생
        double a = 2.2; //2.2는 double 데이터타입을 가지고 있다
        float b = 2.2F; // F를 붙임으로써 해당 숫자가 float 데이터타입임을 명시적으로 지정 가능하다.
        // int c =  2147483648; // integer의 범위를 벗어나서 에러 발생
        //long c = 2147483648; // 상수의 기본 데이터타입이 int여서 에러 발생
        long c = 2147483648L; // L을 붙임으로써 해당 숫자가 long 데이터타입임을 명시
        byte d = 100; // byte, short의 경우 int 타입 상수 사용 가능
        //byte e = 128; // 단, byte의 범위를 넘어갈 경우 에러 발생
    }
}
