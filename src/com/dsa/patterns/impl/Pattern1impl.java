package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern1impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *      ***
     *      ***
     *      ***
     * **/

    @Override
    public void printPattern(int n) {
        System.out.println("Printed Pattern : ");
        for(int i=0;i<n;i++){
            System.out.println("*".repeat(n));
        }
    }
}
