package com.dsa.math;

public class ReverseNumber {
    public static int reverse(int N){
        int res=0;
        while(N>0){
            int rem = N%10;
            res=res*10+rem;
            N = (N - rem)/10;
        }
        System.out.println("Reverse Number: "+res);
        return res;
    }
}
