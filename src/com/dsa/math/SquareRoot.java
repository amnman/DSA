package com.dsa.math;

public class SquareRoot {

    public static void findRoot(int n, int precision){
        int start = 0;
        int end = n/2;
        int mid=0;
        while(start<=end){
            mid = end-(end-start)/2;
            if(mid*mid==n){
                break;
            }
            if(mid*mid>n){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        /**
         * Providing Precision value
         */
        double p = 0.1,res=mid;
        for(int i=0;i<precision;i++){
            while(res*res<=n){
                res+=p;
            }
            res-=p;
            p/=10;
        }
        System.out.printf("Square Root: %.2f",res);
    }
}
