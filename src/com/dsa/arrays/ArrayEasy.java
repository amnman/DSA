package com.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayEasy {
    /**
     *Sorted and Rotated Array
     */
    public static boolean check(int[] nums) {
        int size = nums.length,count=0;
        for(int i=1;i<size-1;i++){
            if(nums[i]>nums[(i+1)%size]){
                count+=1;
            }
        }
        return count<=1;
    }


    public static void removeDuplicates(int[] nums) {
        int left=0,right=1;
        while(right<nums.length){
            if(nums[left]!=nums[right]){
                left+=1;
                nums[left]=nums[right];
            }
            right+=1;
        }
        left+=1;
        System.out.println("Non-Duplicates: "+left+" Array: "+ Arrays.toString(nums));
    }

    public static void rotateRight(int[] nums,int k){
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[(i+k)%nums.length]=nums[i];
        }
        System.out.println("Rotated: "+Arrays.toString(res));
    }

    /**
     * Takes O(N) Time Complexity and Space complexity of O(K)
     */
    public static void rotateKPlaces(int[] nums,int k){
            int[] back = new int[k];
            for(int i=0;i<k;i++){
                back[i]=nums[i];
            }
            for(int i=k;i<nums.length;i++){
                nums[i-k] = nums[i];
            }
            int n = nums.length-k;
            for(int i=nums.length-k;i<nums.length;i++){
                nums[i]=back[i-n];
            }
            System.out.println("Rotated: "+Arrays.toString(nums));
    }
    /**
     *Takes O(N) Time Complexity and Space complexity of O(1)
     */
    public static void rotateNPlacesRight(int[] arr, int n){
        rotate(arr,0,arr.length-1);
        rotate(arr,0,n-1);
        rotate(arr,n,arr.length-1);

        System.out.println("Rotated n times: "+Arrays.toString(arr));
    }
    public static void rotate(int[] arr,int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start+=1;
            end-=1;
        }
    }

    /**
     * Given an integer array nums,
     * move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     */
    public static void moveZeroes(int[] nums) {
        int i=0,j=1;
        while(i<j && j<nums.length){
            if(nums[i]==0){
                if(nums[i]!=nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i+=1;
                }
            }else{
                i+=1;
            }
            j+=1;
        }
    }

    public static void union(int[] arr1, int[] arr2){
        List<Integer> list = new ArrayList<>();
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                list.add(arr2[j]);
                j+=1;
            }else if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i+=1;
            }else{
                list.add(arr1[i]);
                i+=1;
                j+=1;
            }
        }
        while(i<arr1.length){
            list.add(arr1[i]);
            i+=1;
        }
        while(j<arr1.length){
            list.add(arr2[j]);
            j+=1;
        }
        System.out.println("Union: "+list);
    }

    public static void longestSubArray(int[] arr,int sum){
        int i=0,j=0;
        int res=0,count=0,temp=0;
        while(j<arr.length-1){
            temp += arr[j];
            if(temp==sum){
                count=j-i+1;
                i+=1;
                j=i;
                temp=0;
            }
            if(temp>sum){
                j+=1;
            }
            j+=1;
            res=Math.max(res,count);
        }
        System.out.println("Longest Sequence: "+res);
    }

    /**
     * Given an array nums with n objects colored red, white, or blue,
     * sort them in-place so that objects of the same color are adjacent,
     * with the colors in the order red, white, and blue.
     *
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *
     *  Dutch National Flag algorithm.
     *
     * We divide the array into three partitions using three pointers – low, mid, and high.
     * From 0 to low-1, we’ll keep only 0s
     * From low to mid-1, only 1s
     * From high+1 to n-1, only 2
     * Time Complexity O(n)
     * Space Complexity O(1)
     */
    public static void sortColors(int[] nums) {
        int mid=0,low=0,high=nums.length-1;
        while(mid>=low && mid<=high){
            if(nums[mid]==0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid+=1;
                low+=1;
            }else if(nums[mid]==2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high-=1;
            }else if(nums[mid]==1){
                mid+=1;
            }
        }
    }

    /**
     * Given an array nums of size n, return the majority element.
     *
     * The majority element is the element that appears more than ⌊n / 2⌋ times.
     * You may assume that the majority element always exists in the array.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * Incrementing the Counter if the same element if found next else decrementing the count. If the Count==0 then storing the element value.
     */
    public int majorityElement(int[] nums) {
        int count=0,element=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                count=1;
                element=nums[i];
            }else if(element!=nums[i]){
                count-=1;
            }else{
                count+=1;
            }
        }
        int ctr=0;
        for(int i = 0;i<nums.length;i++){
            if(element==nums[i]){
                ctr+=1;
            }
        }
        if(ctr<=nums.length/2){
            element=-1;
        }
        return element;
    }

    /**
     *
     * Kadane's Algorithm : Maximum Subarray Sum in an Array
     * Iterate through the array using a variable i. During each iteration, add the current element arr[i] to a running sum variable.
     * Keep track of the maximum sum encountered during the iteration by comparing the current sum with the previous maximum sum, and update it if the current sum is greater.
     * If at any point the sum becomes negative, reset it to 0, as a negative sum won't contribute positively to the overall maximum sum.
     * Continue the iteration until all elements in the array are processed.
     * Finally, return the maximum sum encountered during the iteration.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static void maxSubArray(int[] nums) {
        int sum=0,j=0,max=Integer.MIN_VALUE;
        int start=0,actualStart=0,end=0;
        while(j<nums.length){
            // Setting the Start value whenever the sum goes to Zero
            if(sum==0){
                start=j;
            }
            sum+=nums[j];
            if(sum>max){
                max=sum;
                end=j;
                //Updating the Start so that we can have the updated start when the sum>max
                actualStart=start;
            }
            if(sum<0){
                sum=0;
            }
            j+=1;
        }
        System.out.println("Sum: "+max);
        for(int i=actualStart;i<=end;i++){
            System.out.print(nums[i]+"\t");
        }
    }

    /**
     * Finding Next Permutation, Starting search from the right to left to find the point where the left<right
     * Once the dip is found, replacing it with the min number greater than it.
     * Reversing the elements with position>index so that we get the next permutation.
     */
    public void nextPermutation(int[] nums) {
        int index =-1,n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index<0){
            reverse(nums, 0, nums.length-1);
            return;
        }
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,index,i);
                break;
            }
        }
        reverse(nums,index+1,nums.length-1);
    }

    public void swap(int[] nums, int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}
