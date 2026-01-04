package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern15impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       A B C D E
     *       A B C D
     *       A B C
     *       A B
     *       A
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
