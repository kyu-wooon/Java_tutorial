package org.opentutorials.javatutorials.overiding.example3;

class Calculator{
    int[] oprands; //배열 변수 설정

    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }

    public void sum(){ //들어온 변수만큼 더함
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }

    public void avg(){// 들어온 변수의 평균값
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);//배열의 길이만큼 나눈다
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(new int[]{10,20});
        c1.sum();
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();
        c1.avg();
    }
}