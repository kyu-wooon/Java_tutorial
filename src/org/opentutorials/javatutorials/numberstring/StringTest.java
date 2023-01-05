package org.opentutorials.javatutorials.numberstring;

public class StringTest {
    public static void main(String[] args){
        System.out.println('생'); // 문자는 단따옴표로 감싼다.
        //System.out.println('생활코딩');//문자열은 단따옴표로 감쌀 수 없다.
        System.out.println("생활코딩");//문자열은 쌍따옴표로 감싸야 한다.
        System.out.println("생");//문자도 쌍따옴표로 감쌀 수 있다. (한 글자도 문자열이 될 수 있다.)
        System.out.println("생활"+"코딩");  //문자열끼리 더할 수 있다.
        System.out.println("1"+"1");
        //System.out.println("선생님이 말했다 "모두 자리에 앉으렴.""); //문자열 안에 따옴표를 이렇게 사용할 수 없다.
        System.out.println("선생님이 말했다 \"모두 자리에 앉으렴.\""); // \를 "앞에 위치시키면 단순한 문자로 해석하도록 강제할 수 있다.
        System.out.println("줄\n을\n바\n꾸\n는\n법"); // \n으로 줄을 바꿀 수 있다.
        System.out.println('1'+'1');
        System.out.println('A'+'B');
    }

}
