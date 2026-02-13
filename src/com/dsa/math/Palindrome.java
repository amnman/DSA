package com.dsa.math;

public class Palindrome {
    public static void check(int n){
        if(n==ReverseNumber.reverse(n)){
            System.out.println("Palindrome Number!");
        }else{
            System.out.println("Not a Palindrome Number!");
        }
    }
}
