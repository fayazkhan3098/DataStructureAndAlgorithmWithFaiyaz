package DSA.SortingArrays.Algorithms;

import java.util.Arrays;

public class InsertionSortingAlgorithm {
    public static void main(String[] args) {
        int[][] arr = {{2,1,0,2,1,0,0,1,2,0},
                {-1, 0, 85, -25, 6},
                {1},
                {2, 0}};

        for (int[] ele : arr) {
            System.out.println(Arrays.toString(InsertionSort(ele)));
        }
    }
    private static int[] InsertionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j > 0 ; j--) {
                if(arr[j] < arr[j-1])
                    swap(arr,j,j-1);
                else break;
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
}
