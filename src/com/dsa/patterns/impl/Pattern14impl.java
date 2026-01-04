package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern14impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       A
     *       A B
     *       A B C
     *       A B C D
     *       A B C D E
     * **/
    @Override
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
