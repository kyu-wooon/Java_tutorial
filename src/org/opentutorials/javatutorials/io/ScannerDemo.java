package org.opentutorials.javatutorials.io;
import java.util.Scanner; //Scanner기능을 사용할 수 있도록 패키지를 import
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //입력값을 받는 Scanner 생성
        int i = sc.nextInt(); // sc Scanner를 통해서 값는 int값을 i로 정의
        System.out.println(i*1000); // i * 1000 결과물을 출력
        sc.close();
    }
}
