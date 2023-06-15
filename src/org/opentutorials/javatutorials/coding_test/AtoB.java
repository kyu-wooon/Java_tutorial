package org.opentutorials.javatutorials.coding_test;

public class AtoB {
    public static void main(String[] args) {
        String after = "apple";
        String before = "allpe";
        int answer = 1;

        for(int i = 0; i<after.length(); i++){
            if(after.indexOf(before.charAt(i)) == -1){
                answer = 0;
                break;
            }else{
                after = after.replaceFirst(String.valueOf(before.charAt(i)),"");
                System.out.println(after);
            }
        }
        System.out.println(answer);
    }
    }

