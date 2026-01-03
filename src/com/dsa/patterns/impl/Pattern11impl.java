package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern11impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *       1
     *       01
     *       101
     *       0101
     *       10101
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j>=1;j--){
                if(j%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}
