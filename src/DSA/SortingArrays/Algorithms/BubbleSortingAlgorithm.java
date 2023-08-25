package DSA.SortingArrays.Algorithms;

import java.util.Arrays;

// time complexity of bubble sort algorithm is best case : O(N) Worst case : O(N^2) where N = Length of array

public class BubbleSortingAlgorithm {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1, 4, 5};
        System.out.println(Arrays.toString(arr));
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){

        //rin the steps n-1 times
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            // for each step max element will come at respective last index
            for (int j = 1; j < arr.length - i ; j++) {
                //swap if the item is smaller than the previous one
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped)//for any step no swap has been done means array is sorted
                break;
        }
    }
}
