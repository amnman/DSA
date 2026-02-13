package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Hashing {

    public static void hashingTest(int[] arr){
        int n = arr.length;
        int[] hash = new int[n];
        for (int j : arr) {
            hash[j] += 1;
        }
        for(int i=0;i<n;i++){
            System.out.println(i+" : "+hash[i]);
        }
    }
    public static void hashString(String val){
        int[] arr = new int[26];
        for(char a:val.toCharArray()){
            arr[a-'a']+=1;
        }
        for(char a : val.toCharArray()){
            System.out.println(a+" : "+arr[a-'a']);
        }
    }
    public static void countFrequency(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

}
