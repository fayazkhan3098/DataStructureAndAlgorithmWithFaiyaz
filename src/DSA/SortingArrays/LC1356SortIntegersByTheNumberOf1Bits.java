package DSA.SortingArrays;

import java.util.Arrays;

class LC1356SortIntegersByTheNumberOf1Bits {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};// [0,1,2,4,8,3,5,6,7]
        System.out.println(Arrays.toString(sortByBits(arr)));
    }
    public static int[] sortByBits(int[] arr) {
        int[] nobits = new int[arr.length];
        int[] temparr = Arrays.copyOf(arr,arr.length);
        for(int i = 0 ; i < arr.length ; i++) {
            int count = 0 ;
            while(temparr[i] > 0) {
                temparr[i] &= (temparr[i] -1);
                count++;
            }
            nobits[i] = count;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nobits));
        quicksort(nobits,0,nobits.length-1,arr);
        return arr;
    }
    static void quicksort(int[] arr, int low, int hi,int[] arr2) {
        if(low>hi)return;
        int s = low;
        int e = hi;
        int m = s + (e - s)/2;
        int pivot = arr[m];
        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while(arr[e] > pivot) {
                e--;
            }
            while(s<=e){
                swap(arr,s,e);
                swap(arr2,s,e);
                s++;
                e--;
            }
        }
        quicksort(arr,low,e,arr2);
        quicksort(arr,s,hi,arr2);
    }
    static void swap(int[] arr , int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;

    }
}