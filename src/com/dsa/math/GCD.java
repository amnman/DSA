package com.dsa.math;

public class GCD {

    /**
     * Time Complexity for this algorithm is O(min(N1,N2)). Space Complexity O(1)
     */
    public static int greatestCommonDivisor(int a, int b){

        for(int i=Math.min(a,b);i>0;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }

        return 1;
    }

    /**
     * Using Eucledian Algorithm
     * n1 = 20, n2 = 15
     * gcd(20, 15) = gcd(20 - 15, 15) = gcd(5, 15)
     * gcd(5, 15)  = gcd(15 - 5, 5)  = gcd(10, 5)
     * gcd(10, 5)  = gcd(10 - 5, 5) = gcd(5, 5)
     * gcd(5, 5)   = gcd(5 - 5, 5)  = gcd(0, 5)
     */

    public static int gcdEucledian(int n1,int n2){

        if(n1==0){
            return n2;
        }
        if(n2==0){
            return n1;
        }

        while(Math.min(n1,n2)>0){
            int temp=Math.min(n1,n2);
            n1=Math.max(n1,n2)-temp;
            n2=temp;
        }
        return Math.max(n1,n2);
    }

    public static int gcdEucledianSimplified(int n1,int n2){

        while(n1>0 && n2>0){
            if(n1>n2){
                n1=n1%n2;
            }else{
                n2=n2%n1;
            }
        }
        if(n2==0){
            return n1;
        }
        return n2;
    }

    public static int gcdEucledianRecursion(int n1, int n2){
        if(n1==0){
            return n2;
        }
        if(n2==0){
            return n1;
        }
        return gcdEucledianRecursion(Math.max(n1,n2)-Math.min(n1,n2),Math.min(n1,n2));
    }

    public static void printDivisors(int n){
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+"\t");
                if(n/i!=i){
                    System.out.print(n/i+"\t");
                }
            }
        }
        System.out.println();
    }

}
