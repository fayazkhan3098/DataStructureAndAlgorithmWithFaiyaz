package DSA.SortingArrays.Algorithms;

import java.util.Arrays;

public class CyclicSortingAlgorithm {
    public static void main(String[] args) {
        int[][] arr = {{3, 5, 2, 1, 4,5},
                {6, 4, 5, 3, 1, 2},
                {4,3,2,7,7,2,3,1 },
                {2, 1}};

        for (int[] ele : arr) {
            CyclicSort(ele);
            System.out.println(Arrays.toString(ele));
        }
        //CyclicSort(new int[]{4,3,2,7,7,2,3,1});
    }
    private static void CyclicSort(int[] arr){
        int i =0;
        while (i < arr.length -1){
            int correct = arr[i] - 1 ;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
