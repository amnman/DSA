package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern3impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *      1
     *      12
     *      123
     *      1234
     *      12345
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
