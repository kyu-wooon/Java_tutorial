package org.opentutorials.javatutorials.io;

import java.util.Scanner;
import java.io.*;

public class Scanner3Demo {
    public static void main(String[] args) {
        try {
            //File file = new File("C:\\Users\\admin\\Documents\\MEGA\\이것저것\\개발공부\\Java_tutorial\\src\\org\\opentutorials\\javatutorials\\io\\out.txt"); //입력값이 될 파일
            File file = new File("out.txt"); //입력값이 될 파일
            Scanner sc = new Scanner(file); // Scanner에 file(out.txt)를 입력받는다
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000); //그 값이 int일 경우 1000을 곱해 출력한다
            }
            sc.close();
        } catch(FileNotFoundException e){ // 예외 처리
            e.printStackTrace();
        }

    }

}
