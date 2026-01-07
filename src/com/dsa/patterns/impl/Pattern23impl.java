package com.dsa.patterns.impl;

import com.dsa.patterns.Pattern;

public class Pattern23impl implements Pattern {

    /**
     * Given an Integer 'n' print the following pattern
     *
     *  1 1 1 1 1 1 1
     *  1 2 2 2 2 2 1
     *  1 2 3 3 3 2 1
     *  1 2 3 4 3 2 1
     *  1 2 3 3 3 2 1
     *  1 2 2 2 2 2 1
     *  1 1 1 1 1 1 1
     *
     * **/

    @Override
    public void printPattern(int n) {
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                int bottom = i;
                int top = (2*n-2)-i;
                int left = j;
                int right = (2*n-2)-j;
                int minDistance = Math.min(Math.min(bottom,top),Math.min(left,right));
                System.out.print((minDistance+1)+" ");
            }
            System.out.println();
        }
    }

    /**
     * Pattern Printing for each number
     * **/
    private void patternPrinter(int n){
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                if(i==0 || j==0 || i==2*n-2 || j==2*n-2){
                    System.out.print(n);
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
