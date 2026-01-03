package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern12impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       1      1
     *       12    21
     *       123  321
     *       12344321
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print(" ".repeat(2*(n-i)));
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
