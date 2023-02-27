package org.opentutorials.javatutorials.overiding.example2;

class Calculator{
    int left, right;
    int third = 0; //3번째 입력값에 해당하는 변수 추가

    public void setOprands(int left, int right){
        System.out.println("setOprands(int left, int right)"); //입력값이 2개일 때 출력
        this.left = left;
        this.right = right;
    }

    public void setOprands(int left, int right, int third){
        //입력값이 3개일 때 출력
        System.out.println("setOprands(int left, int right, int third)");
        this.left = left;
        this.right = right;
        this.third = third;
    }

    public void sum(){
        System.out.println(this.left+this.right+this.third);
    }

    public void avg(){
        System.out.println((this.left+this.right+this.third)/3);
    }
}

public class CalculatorDemo {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();
        c1.avg();

    }

}