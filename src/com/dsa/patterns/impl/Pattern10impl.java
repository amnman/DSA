package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern10impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       *
     *       **
     *       ***
     *       ****
     *       *****
     *       ****
     *       ***
     *       **
     *       *
     * **/

    @Override
    public void printPattern(int n) {
        int i=1,stars=0;
        while (i<2*n){
            stars=i;
            if(i>n){
                stars=2*n-i;
            }
            System.out.print("*".repeat(stars));
            System.out.println();
            i+=1;
        }
    }
}
