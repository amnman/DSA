package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern20impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *   *        *
     *   **      **
     *   ***    ***
     *   ****  ****
     *   **********
     *   ****  ****
     *   ***    ***
     *   **      **
     *   *        *
     *
     * **/

    @Override
    public void printPattern(int n) {
        int d;
        for(int i=1;i<2*n;i++){
            d=i;
            if(i>n){
                d=n-i%n;
            }
            printingSupporter(d,"*");
            printingSupporter(2*(n-d)," ");
            printingSupporter(d,"*");
            System.out.println();
        }
    }

    private void printingSupporter(int num, String s){
        for(int i=0;i<num;i++){
            System.out.print(s);
        }
    }
}
