package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern7impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       *
     *      ***
     *     *****
     *    *******
     *   *********
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=1;i<=n;i++){
            System.out.print(" ".repeat(n-i));
            System.out.print("*".repeat(2*i-1));
            System.out.println();
        }
    }
}
