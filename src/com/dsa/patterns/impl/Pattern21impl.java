package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern21impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *  * * * * *
     *  *       *
     *  *       *
     *  *       *
     *  * * * * *
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || i==n-1 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
