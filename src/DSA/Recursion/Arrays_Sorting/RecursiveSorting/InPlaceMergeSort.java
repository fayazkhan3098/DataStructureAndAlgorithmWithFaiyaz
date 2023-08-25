package DSA.Recursion.Arrays_Sorting.RecursiveSorting;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 4, 3, 5, 7, 1};
        InplaceMergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void InplaceMergeSort(int[] arr, int s, int e) {
        if(e-s == 1) {
            return;
        }
        int m = (s + e) / 2 ;
        InplaceMergeSort(arr,s,m);
        InplaceMergeSort(arr,m,e);
        InPlaceMerge(arr,s,m,e);
    }

    private static void InPlaceMerge(int[] arr, int s, int m, int e) {
        int[] mix = new int[e-s];

        int i = s;
        int j = m;
        int k= 0;
        while(i < m && j < e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            }else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        while(i < m) {
            mix[k] = arr[i];
            k++;
            i++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s + l] = mix[l];
        }
    }
}
