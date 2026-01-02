package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern5impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *      *****
     *      ****
     *      ***
     *      **
     *      *
     * **/

    @Override
    public void printPattern(int n) {
        if(n<=0){
            System.out.println("Enter Valid Input > Zero");
            return;
        }
        System.out.println("Printed Pattern : ");
        for(int i=n;i>=1;i--){
            System.out.println("*".repeat(i));
        }
    }
}
