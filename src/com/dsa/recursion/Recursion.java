package com.dsa.recursion;

import java.util.Arrays;
import java.util.stream.Stream;

public class Recursion {

    public static void print1ToN(int n){
        if(n==0){
            return;
        }else{
            System.out.print(n+" ");
            print1ToN(n-1);
        }
    }
    public static void printNto1(int n){
        if(n==0){

        }else{
            System.out.print(n+" ");
            printNto1(n-1);
        }
    }
    public static void print1ToN(int start,int end){
        if(start<=end){
            System.out.print(start+" ");
        }else{
            return;
        }
        print1ToN(start+1,end);
    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
        }
        System.out.println("Reversed: "+ Arrays.toString(arr));
    }
    public static void palindrome(String word){
        int start = 0;
        int end = word.length()-1;
        boolean check = true;
        while(start<end){
            if(word.charAt(start)!=word.charAt(end)){
                check=false;
                break;
            }
            start+=1;
            end-=1;
        }
        if(check){
            System.out.println("Palindrome!!");
        }else{
            System.out.println("Not a Palindrome!!");
        }
    }
    public static boolean palindromRec(int i,String word){
        if(i>=word.length()/2){
            return true;
        }
        if(word.charAt(i)!=word.charAt(word.length()-i-1)){
            return false;
        }
        return palindromRec(i+1,word);
    }
    public static int fibonacci(int n){
        if(n<=1){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void fibonacciStream(int n){
        Stream.iterate(new int[]{0,1},i->new int[]{i[1],i[0]+i[1]}).map(i->i[1]).limit(n).forEach(i->System.out.print(i+" "));
    }
}
