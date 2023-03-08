package org.opentutorials.javatutorials.abstractclass.example3;

abstract class Calculator{ //추상 클래스 추가
    int left, right;
    public void setOprands(int left, int right){
        this.left = left;
        this.right = right;
    }
    public abstract void sum();  //추상 메소드 sum
    public abstract void avg();  //추상 메소드 avg
    public void run(){ //일반 메소드 run
        sum();
        avg();
    }
}
class CalculatorDecoPlus extends Calculator { //추상 클래스 상속
    public void sum(){ // 추상 메소드 sum 오버라이딩
        System.out.println("+ sum :"+(this.left+this.right));
    }
    public void avg(){ // 추상 메소드 avg 오버라이딩
        System.out.println("+ avg :"+(this.left+this.right)/2);
    }
}
class CalculatorDecoMinus extends Calculator { //추상 클래스 상속
    public void sum(){ //추상 메소드 sum 오버라이딩
        System.out.println("- sum :"+(this.left+this.right));
    }
    public void avg(){ //추상 메소드 sum 오버라이딩
        System.out.println("- avg :"+(this.left+this.right)/2);
    }
}
public class CalculatorDemo {
    public static void main(String[] args) {
        CalculatorDecoPlus c1 = new CalculatorDecoPlus();
        c1.setOprands(10, 20);
        c1.run();

        CalculatorDecoMinus c2 = new CalculatorDecoMinus();
        c2.setOprands(10, 20);
        c2.run();
    }

}