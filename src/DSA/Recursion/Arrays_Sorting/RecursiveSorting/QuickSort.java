package DSA.Recursion.Arrays_Sorting.RecursiveSorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,3,1};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr, int low, int hi) {
        if(low >= hi) {
            return;
        }
        int s = low;
        int e = hi;
        int m = s + (e - s) / 2 ;
        int pivot = arr[m];
        while(s <= e) {
            while(arr[s] < pivot) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            while(s <= e) {
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        // now my pivot is at correct position , please sort two halves now
        quickSort(arr, low, e);
        quickSort(arr, s,hi);
    }
}
