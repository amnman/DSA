package com.dsa.math;

public class PrimeNumber {

    public static void isPrime(int n){
        if(n==1){
            System.out.println("Neither Prime nor Composite");
        }
        boolean check=true;
        for(int i =2;i*i<=n;i++){
            if(n%i==0){
                check=false;
                break;
            }
        }
        if(check){
            System.out.println("Is Prime!");
        }else{
            System.out.println("Is not Prime!");
        }
    }
}
