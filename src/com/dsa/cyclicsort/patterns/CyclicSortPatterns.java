package com.dsa.cyclicsort.patterns;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSortPatterns {
    /**
     * Given an array nums containing n distinct numbers in the range [0, n],
     * return the only number in the range that is missing from the array.
     *
     */
    public static void missingNumber(int[] arr){
        int size = arr.length;
        int swap=0;
        while(swap<size){
            if(arr[swap]!=swap && arr[swap]<size){
                int temp = arr[swap];
                arr[swap] = arr[temp];
                arr[temp]=temp;
            }else{
                swap+=1;
            }
        }
        int missing=-1;
        for(int i = 0; i<size;i++){
            if(i!=arr[i]){
                missing=i;
                break;
            }
        }
        System.out.println("Missing Number: "+missing);
    }

    /**
     *Given an array nums of n integers where nums[i] is in the range [1, n],
     *return an array of all the integers in the range [1, n] that do not appear in nums.
     */
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int swap = 0,size=nums.length;
        while(swap<size){
            int correct = nums[swap]-1;
            if(nums[swap]<=size && nums[correct]!=nums[swap]){
                int temp = nums[swap];
                nums[swap] = nums[temp-1];
                nums[temp-1] = temp;
            }else{
                swap+=1;
            }
        }
        System.out.println("Array:"+ Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<size;i++){
            if(nums[i]!=i+1){
                list.add(i+1);
                System.out.println(list);
            }
        }
        return list;
    }


    /**
     *Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     *
     * There is only one repeated number in nums, return this repeated number.
     */
    public static int findDuplicate(int[] arr){
        int swap = 0,size=arr.length;
        while(swap<size){
            if(arr[swap]!=swap+1){
                int correct = arr[swap]-1;
                if(arr[swap]<size && arr[swap]!=arr[correct]){
                    int temp = arr[swap];
                    arr[swap] = arr[temp-1];
                    arr[temp-1] = temp;
                }else{
                    return arr[swap];
                }
            }else{
                swap+=1;
            }
        }
        return 0;
    }

    /**
     * You are given an integer array nums representing the data status of this set after the error.
     *
     * Find the number that occurs twice and the number that is missing and return them in the form of an array.
     */
    public static int[] setMismatch(int[] arr){
        int swap=0, size=arr.length;
        int[] res = new int[2];
        while(swap<size){
            if(arr[swap]!=swap+1){
                int correct = arr[swap]-1;
                if(arr[swap]!=arr[correct]){
                    int temp = arr[swap]-1;
                    arr[swap] = arr[temp-1];
                    arr[temp-1] = temp;
                }else{
                    res[0]=arr[swap];
                    swap+=1;
                }
            }else{
                swap+=1;
            }
        }
        System.out.println("Arr: "+Arrays.toString(arr));
        for(int i = 0; i<arr.length;i++){
            if(arr[i]!=i+1){
                res[1]=i+1;
            }
        }
        return res;
    }

    /**
     *Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
     *
     * You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
     */
    public static int firstMissingPositive(int[] arr) {
        int swap = 0, size = arr.length;
        while(swap<size){
            if(arr[swap]>0 && arr[swap]<size){
                int correct = arr[swap]-1;
                if(arr[swap]!=arr[correct] && arr[swap]!=swap+1){
                    int temp = arr[swap];
                    arr[swap] = arr[temp-1];
                    arr[temp-1] = temp;
                }else{
                    swap+=1;
                }
            }else{
                swap+=1;
            }
        }
        int res=-1;
        for(int i=0;i<size;i++){
            if(arr[i]!=i+1){
                res=i+1;
                break;
            }
        }
        if(res<0){
            res=size+1;
        }
        return res;
    }
}
