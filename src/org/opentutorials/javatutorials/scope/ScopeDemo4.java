package org.opentutorials.javatutorials.scope;

public class ScopeDemo4 {
    static void a(){
        String title = "coding everybody";
    }
    public static void main(String[] args) {
        a();
        //System.out.println(title); //이 주석을 해제하면 에러가 발생한다.
    }

}