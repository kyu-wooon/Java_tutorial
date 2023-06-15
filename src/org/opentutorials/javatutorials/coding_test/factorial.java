package org.opentutorials.javatutorials.coding_test;

public class factorial {
    public static void main(String[] args) {
        int n = 7;
        int answer = 0;
        int i = 1;
        int i_tmp = 1;
        boolean p = true;

        while(p){
        for(int j = i_tmp; j>1 ; j--){

            i = i * j;
            //System.out.println(i);
        }
        if (i > n){

            answer = i_tmp;
            System.out.println("i의 값 : " + i );
            break;

        }else{System.out.println("i의 값 : " + i );

            i_tmp = i_tmp+1;
            i = i_tmp;}}

        System.out.println("answer의 값" + answer);

    }
}
