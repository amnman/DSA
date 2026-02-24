package com.dsa.sorting;

import java.util.Arrays;

public class SortingAlgorithms {

    /**
     * @param arr unsorted array to be passed
     *<p>Selection Sort Steps:</p>
     *<p>Select an element and compare with other elements to find the min element for a position</p>
     *<p>Once min element for a position is found perform swapping.</p>
     *<p>Continue till the last element is swapped in correct sorting order.</p>
     *<p>Time Complexity: O(N^2)</p>
     */
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0;i<n-1;i++){
            int min_index=i;
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
        System.out.println("Sorted: "+ Arrays.toString(arr));
    }

    /**
     * @param arr unsorted array to be passed
     *<p>Bubble Sort Steps:</p>
     *<p>Select an element and compare with next element and perform swapping based on the comparison</p>
     *<p>Update the swap check to true or false based on the if the swapping was performed.</p>
     *<p>Continue till the last element is swapped in correct sorting order and break the loop if Swap check was false</p>
     *<p>Time Complexity: O(N^2)</p>
     */
    public static void bubbleSort(int [] arr){
        for(int i=0;i< arr.length-1;i++){
            boolean swapped = false;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        System.out.println("Sorted: "+Arrays.toString(arr));
    }
    /**
     * @param arr unsorted array to be passed
     *<p>Insertion Sort Steps:</p>
     *<p>Start by comparing j with i+1 and perform swapping until j is less than i+1 </p>
     *<p>Increment i so that next element can be compared with the list of earlier elements</p>
     *<p>Involves verifying each of the element from the earlier sorted list of element at each step</p>
     *<p>Time Complexity: O(N^2)</p>
     */
    public static void insertionSort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int j=0;
            while(j<i+1){
                if(arr[j]>arr[i+1]){
                    int temp = arr[j];
                    arr[j]=arr[i+1];
                    arr[i+1]=temp;
                }
                j+=1;
            }
        }
        System.out.println("Sorted: "+Arrays.toString(arr));
    }
    /**
     * @param arr unsorted array to be passed
     *<p>Insertion Sort Steps:</p>
     *<p>Uses the two pointer approach, Iteration starts with i=1 , j=0 </p>
     *<p>Swapping is performed till the current element is greater than the next element.</p>
     *<p>Through this approach already sorted values are not re-checked</p>
     *<p>Time Complexity: O(N^2)</p>
     */
    public static void insertionSortUpdated(int[] arr){
        for(int i =1;i<arr.length;i++){
            int j = i-1;
            while(j>=0 && arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j-=1;
            }
        }
        System.out.println("Sorted: "+Arrays.toString(arr));
    }

    /**
     * @param arr unsorted array to be passed
     *<p>Merge Sort Steps:</p>
     *<p>Divide the given array into two halves, till it is divided to the last element</p>
     *<p>Compare the elements and then merge the resultant array</p>
     *<p>Continue till the last element is swapped in correct sorting order</p>
     *<p>Time Complexity: O(NLogN)</p>
     */
    public static void mergeSort(int l, int r,int[] arr){
        if(l<r){
            int mid = l+(r-l)/2;
            mergeSort(l,mid,arr);
            mergeSort(mid+1,r,arr);
            int right = mid+1,left=l;
            int[] temp = new int[r-l+1];
            int count=0;
            while(left<=mid && right<=r){
                if(arr[left]>=arr[right]){
                    temp[count]=arr[right];
                    right+=1;
                }else{
                    temp[count]=arr[left];
                    left+=1;
                }
                count+=1;
            }
            while(left<=mid){
                temp[count]=arr[left];
                count+=1;
                left+=1;
            }
            while(right<=r){
                temp[count]=arr[right];
                count+=1;
                right+=1;
            }
            for(int i = l;i<=r;i++){
                arr[i]=temp[i-l];
            }
        }
    }

    /**
     *BubbleSort Recursive, Sorting from behind.
     * @param i Size of array minus 1
     * @param arr Array to be sorted
     *
     * Each iteration the value of i is reduced so that the loop goes from last to first elements.
     * T₂(i) = T₁(n-i) + T₂(i-1)
     * Time Complexity: O(N^2)
     */
    //{6,4,1,6,37,8,2,2,5,1}
    public static void bubbleSortRecursiveBackward(int i,int[] arr){
        if(i>=0){
            bubbleSorter(arr,i);
            bubbleSortRecursiveBackward(i-1,arr);
        }
    }
    private static void bubbleSorter(int[] arr, int i){
        if(i>=arr.length-1){
            return;
        }
        if(arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        bubbleSorter(arr,i+1);
    }

    /**
     *BubbleSort Recursive, Sorting from forward direction.
     * @param i 0
     * @param arr Array to be sorted
     *
     * Each iteration the value of i is increased so that the loop goes from first to last elements.
     *
     * T₂(i) = O(n-i) + T₂(i+1)
     * Time Complexity: O(N^2)
     */
    public static void bubbleSortRecursive(int i,int[] arr){
        if(i<arr.length-1){
            bubbleSorter(arr,i,i+1);
            bubbleSortRecursive(i+1,arr);
        }
    }
    private static void bubbleSorter(int[] arr, int i,int j){
        if(j>arr.length-1){
            return;
        }
        if(arr[i]>arr[j]){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        bubbleSorter(arr,i,j+1);
    }

    /**
     * @param i 1
     * @param arr
     *
     * Swapping is done till the current element is greater than the previous element
     *
     *
     * T(n) = T(n-1) + O(n-1)
     * Time Complexity: O(N^2)
     */
    public static void insertionSortRecursion(int i,int[] arr){
        if(i<arr.length){
            insertionSorter(i-1,arr);
            insertionSortRecursion(i+1,arr);
        }
    }
    public static void insertionSorter(int i,int[] arr){
        if(i>=0 && arr[i]>arr[i+1]){
            int temp = arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            insertionSorter(i-1,arr);
        }
    }

    public static void quickSortIterative(int[] arr){
        int p = arr.length-1;
        for(int i=arr.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(arr[p]<arr[j]){
                    int temp =  arr[p];
                    arr[p] = arr[j];
                    arr[j] = temp;
                }
            }
            p-=1;
        }
    }

    /**
     * @param low 0
     * @param high length-1
     * @param arr array to be sorted
     *
     * Merge Sort
     * Select the first element as pivot point.
     * Start arranging element by comparing the first element with the last element and swap if the left side element is less that right side elements.
     * Continue till the right pointer value is less than left pointer. Swap the pivot element with the right side pointer.
     * Divide the array into two halves - low to pivot-1 and pivot+1 to high.
     *
     * Time Complexity: O(NLogN)
     * Space Complexity: O(1)
     */
//    {6,4,1,6,37,8,2,2,5,1,45}
    public static void quickSort(int low, int high,int[] arr){
        if(low<high){
            int p = quickSorter(low, high,arr);
            quickSort(low,p-1,arr);
            quickSort(p+1,high,arr);
        }
    }

    public static int quickSorter(int low,int high,int[] arr){
        int p = low;
        int i=low,j=high;
        while(i<j){
            while(arr[p]>=arr[i] && i<=high){
                i+=1;
            }
            while(arr[p]<arr[j] && j>=low){
                j-=1;
            }
            if(i<j){
                int temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[p];
        arr[p] = temp;
        return j;
    }

    /**
     *
     * Heap Sort
     * Using the heap structure to sort the given unsorted Array.
     *
     * Time Complexity: O(NLogN)
     */
    public static void heapSorter(int[] arr){
        int n = arr.length;
        for(int i=n/2-1;i>=0;i--){
            minHeapSort(arr,i,n);
        }
        System.out.println("Heap Sort before extraction: "+Arrays.toString(arr));
        for(int i=n-1;i>0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // Heapify the reduced heap
            minHeapSort(arr, 0, i);
        }
    }
    /**
     * Min Heap where at any node the parent node has a value less than the child node
     * Usually useful for sorting array in descending order.
     */
    public static void minHeapSort(int[] arr, int i,int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int min = i;
        if(left<n && arr[min]>arr[left]){
            min = left;
        }
        if(right<n && arr[min]>arr[right]){
            min = right;
        }
        if(min!=i) {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            minHeapSort(arr, min,n);
        }
    }
    /**
     * Max Heap where at any node the parent node has a value greater than the child node.
     * Usually useful for sorting array in ascending order
     */
    public static void maxHeapSort(int[] arr,int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;

        if(left<n && arr[left]>arr[max]){
            max=left;
        }
        if(right<n && arr[right]>arr[max]){
            max=right;
        }
        if(max!=i){
            int temp = arr[max];
            arr[max] = arr[i];
            arr[i] = temp;
            maxHeapSort(arr,max,i);
        }
    }

    /**
     * Cycle Sort
     * Elements have to be continuous in order to sort the array.
     * Swapping the elements
     */
    public static void cycleSort(int[] arr){
        int swap=0;
        while(swap<arr.length){
            if(arr[swap]!=swap+1){
                int temp = arr[swap];
                arr[swap] = arr[temp-1];
                arr[temp-1] = temp;
            }else{
                swap+=1;
            }
        }
        System.out.println("Cyclic Sort: "+Arrays.toString(arr));
    }
}
