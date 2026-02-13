package com.dsa.sorting;

import java.util.*;

public class Heap<T extends Comparable<T>> {
    List<T> list;

    public Heap(){
        list = new ArrayList<>();
    }

    private int left(int index){
        return 2*index+1;
    }
    private int right(int index){
        return 2*index+2;
    }
    private  int parent(int index){
        return (index-1)/2;
    }
    private void swap(int first,int second){
        T temp = list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }

    /**
     *
     * Using Up-heap for adding the elements from leaf node and then traversing upwards.
     *
     */
    private void upHeap(int index){
        if(index==0){
            return;
        }
        int parent = parent(index);
        if(list.get(index).compareTo(list.get(parent))<0){
            swap(index,parent);
            upHeap(parent);
        }
    }

    private T remove() throws Exception{
        if(list.isEmpty()){
            throw new Exception("Removing for an empty heap");
        }
        T temp = list.get(0);

        T last = list.remove(list.size()-1);
        if(!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
        return temp;
    }

    /**
     * Using Down-heap for removing data from the top most node.
     */
    private void downHeap(int index){
        int min = index;
        int left = left(index);
        int right = right(index);

        if(left<list.size() && list.get(left).compareTo(list.get(min))<0){
            min=left;
        }

        if(right<list.size() && list.get(right).compareTo(list.get(min))<0){
            min=right;
        }

        if(min!=index){
            swap(min,index);
            downHeap(min);
        }
    }

    public List<T> heapSort() throws Exception {
        List<T> sorted = new ArrayList<>();
        while(!list.isEmpty()){
            T removed = this.remove();
            sorted.add(removed);
        }
        return sorted;
    }

    public void loadHeap(T[] input){
        for(T t : input){
            insert(t);
        }
    }

}
