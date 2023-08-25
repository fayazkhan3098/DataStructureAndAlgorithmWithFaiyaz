package DSA1.searching.LinearSearch;

import java.util.Arrays;

public class Array2dSearching {
    public static void main(String[] args) {
        int[][] array = {
                {3, 32, 56, 66},
                {2, 5, 12, 88},
                {8, 9, 10},
                {11, 20}
        };
        int target = 12;
        int[] res= Searching2dArray(array, target);
        System.out.println("index : "+ Arrays.toString(res));
        System.out.println("Max: "+SearchingMax2dArray(array));
        System.out.println("Min: "+SearchingMin2dArray(array));

    }
    // finding target element from 2d array and returning its index position
    public static int[] Searching2dArray(int[][] arr, int target){
        int[] res ={-1,-1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target){
                    res[0] = i+1;
                    res[1]= j+1;
                    return res;
                }
            }
        }
        return res;
    }
    // Searching max value from 2d array
    public static int SearchingMax2dArray(int[][] arr){
        int max =Integer.MIN_VALUE;
        for(int[] row : arr) {
            for (int col : row) {
                if(col > max){
                    max = col;
                }
            }
        }
        return max;
    }
    // Searching min value from 2d array
    public static int SearchingMin2dArray(int[][] arr){
        int min =Integer.MAX_VALUE;
        for(int[] row : arr) {
            for (int col : row) {
                if(col < min){
                    min = col;
                }
            }
        }
        return min;
    }
}
