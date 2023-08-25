package DSA.SortingArrays.Algorithms;

import java.util.Arrays;

/*
* its Time complexity for both best and worst case is O(N^2)
* its is best for small size arrays
* */
public class SelectionSortAlgorithm {
    public static void main(String[] args) {
        int[][] arr = {{2,1,0,2,1,0,0,1,2,0},
                {-1, 0, 85, -25, 6},
                {1},
                {2, 0}};
        for (int[] ele : arr) {
            System.out.println(Arrays.toString(selection(ele)));
        }

    }
    public static int[] selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maximum item in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int max = FindMaxIndex(arr,last);
            swap(arr,max,last);
        }
        return arr;
    }

    private static void swap(int[] arr, int max, int end) {
        int temp = arr[max];
        arr[max] = arr[end];
        arr[end] = temp;
    }

    private static int FindMaxIndex(int[] arr, int last) {
        int max =0;
        for (int i = 1; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i ;
            }
        }
        return max;
    }
}
