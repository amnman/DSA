package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern19impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *   **********
     *   ****  ****
     *   ***    ***
     *   **      **
     *   *        *
     *   *        *
     *   **      **
     *   ***    ***
     *   ****  ****
     *   **********
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=n;i>0;i--){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2*(n-i)));
            System.out.print("*".repeat(i));
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*".repeat(i));
            System.out.print(" ".repeat(2*(n-i)));
            System.out.print("*".repeat(i));
            System.out.println();
        }
    }
}
