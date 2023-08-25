package DSA.Recursion.Arrays_Sorting.RecursiveSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 1, 2};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr) {
        if(arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second) {
        int[] merged = new int[first.length + second.length];
        int i =0 ,j = 0, k =0 ;
        while(i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                merged[k] = first[i];
                i++;
            }else {
                merged[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible one of the array is not complete
        while(i < first.length) {
            merged[k] = first[i];
            k++;
            i++;
        }
        while( j < second.length) {
            merged[k] = second[j];
            k++;
            j++;
        }
        return merged;
    }
}
