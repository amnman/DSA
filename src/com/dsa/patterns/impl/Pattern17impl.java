package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern17impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *         A
     *       A B A
     *     A B C B A
     *   A B C D C B A
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
            System.out.print(" ".repeat(n-i-1));
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j));
            }
            for(int j=i-1;j>=0;j--){
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
