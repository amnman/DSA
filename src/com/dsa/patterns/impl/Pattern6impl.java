package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern6impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *      12345
     *      1234
     *      123
     *      12
     *      1
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
