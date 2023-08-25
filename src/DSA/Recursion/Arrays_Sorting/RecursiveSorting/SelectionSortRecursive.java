package DSA.Recursion.Arrays_Sorting.RecursiveSorting;

import java.util.Arrays;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr = {3, 6, 2, 1};
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void selection(int[] arr,int r, int c,int max) {
        if (r == 0)return;
        if(r > c) {
            if(arr[c] > arr[max]) {
                max = c;
                selection(arr,r,c+1,max);
            }else selection(arr,r,c+1,max);
        }else {
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr,r-1,0,0);
        }
    }
}
