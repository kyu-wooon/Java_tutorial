package org.opentutorials.javatutorials;

import java.util.Arrays;

public class array_test {

    public static void main(String[] args) {
        String myString = "oxooxoxxox";

        String myX[] = myString.split("x");
        System.out.println(Arrays.toString(myX));

    }
}
