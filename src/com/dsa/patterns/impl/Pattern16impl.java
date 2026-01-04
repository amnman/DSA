package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern16impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       A
     *       B B
     *       C C C
     *       D D D D
     *       E E E E E
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char)(65+i));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
