package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern18impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *   E
     *   D E
     *   C D E
     *   B C D E
     *   A B C D E
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print((char)(65+j)+" ");
            }
            System.out.println();
        }
    }
}
