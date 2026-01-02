package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern4impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *      1
     *      22
     *      333
     *      4444
     *      55555
     * **/

    @Override
    public void printPattern(int n) {
        for (int i=1; i<=n; i++){
            System.out.println(Integer.toString(i).repeat(i) + " ");
        }
    }
}
