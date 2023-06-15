package org.opentutorials.javatutorials;

import java.util.Scanner;
import java.util.Arrays;

public class arraytest {
    public static void solution(int num1, int num2) {
        int answer = 0;
        double answer2;
        answer2 = (double) num1/num2;
        answer2 =  answer2 * 1000;
        answer = (int) answer2;

        //return answer;
        System.out.println(answer);
        //return answer;
    }



    public static void main(String[] args) {
        solution(3,2);
    }
}