package com.dsa.math;

public class CountDigits {
    public static void digits(int n){

        /**
         * Using Log10 to calculate the
         */

        System.out.println("Number of Digits: "+((int)(Math.log10(n)+1)));
    }
}
