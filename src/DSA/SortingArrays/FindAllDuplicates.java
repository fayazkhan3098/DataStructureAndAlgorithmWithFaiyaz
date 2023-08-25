package DSA.SortingArrays;

import java.util.ArrayList;
import java.util.List;
// https://leetcode.com/problems/find-all-duplicates-in-an-array/
// Amazon Microsoft
class FindAllDuplicates {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,7,8,2,3,1},//[5, 6]
                {1, 3, 5, 2, 5},// [4]
                {1},
                {1,1},
                {4,3,2,7,7,2,3,1}
        };

        for (int[] ele : arr) {

            System.out.println(findDuplicates(ele));
        }
    }
    public static List<Integer> findDuplicates(int[] arr) {
        int i = 0;
        List<Integer> resarr = new ArrayList<>();
        while(i < arr.length ){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != (j+1)){
                resarr.add(arr[j]);
            }
        }
        return resarr;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}