package org.opentutorials.javatutorials.exception;

import java.io.*;
public class CheckedExceptionDemo {
    public static void main(String[] args) {
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();//예외1
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();//예외2
        }
        System.out.println(input);
    }
}