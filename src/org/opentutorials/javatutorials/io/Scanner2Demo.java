package org.opentutorials.javatutorials.io;
import java.util.Scanner;
public class Scanner2Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //입력값이 int면 True, 아니면False를 리턴한다.
            System.out.println(sc.nextInt()*1000);
        }
        sc.close();
    }
}
