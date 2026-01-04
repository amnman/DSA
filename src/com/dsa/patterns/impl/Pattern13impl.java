package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern13impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       1
     *       2 3
     *       4 5 6
     *       7 8 9 10
     *       11 12 13 14 15
     * **/

    @Override
    public void printPattern(int n) {
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num+=1;
            }
            System.out.println();
        }
    }
}
