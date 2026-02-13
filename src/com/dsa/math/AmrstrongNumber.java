package com.dsa.math;

/**
 * An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
 */
public class AmrstrongNumber {

    public static void checkAmrstrong(int n){
        int digits = (int)Math.log10(n)+1;
        int res=0,temp=n;
        while(temp>0){
            int diff = temp%10;
            res+=(int)Math.pow(diff,digits);
            temp/=10;
        }
        if(n==res){
            System.out.println("Amrstrong");
        }else{
            System.out.println("Not Amrstrong!");
        }
    }
}
