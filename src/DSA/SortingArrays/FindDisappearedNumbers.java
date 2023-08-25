package DSA.SortingArrays;
// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.*;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[][] arr = {{4,3,2,7,8,2,3,1},//[5, 6]
                {1, 3, 5, 2, 5},// [4]
                {1},
                {1,1},
                {4,3,2,7,7,2,3,1}
        };

        for (int[] ele : arr) {

            System.out.println(FindDisappearedNumber(ele));
        }
        System.out.println(Arrays.toString(arr[4]));
    }

    private static List<Integer> FindDisappearedNumber(int[] arr){
        List<Integer> res = new ArrayList<>();
        CyclicSort(arr);
        for(int j = 0 ; j < arr.length; j++){
            if(arr[j] != j+1){
                res.add(j+1);
            }
        }
        return res;
    }
    private static void CyclicSort(int[] arr){
        int i =0;
        while (i < arr.length ){
            int correct = arr[i] - 1 ;
            if (arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else i++;

        }
        /*
        * int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }
        * */
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    /*public static List<Integer> findDisappearedNumbers(int[] nums) {
        insertion(nums);
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= nums.length; i++) {
            int ind = binarySearchElement(nums, i);
            if(ind == -1 ){
                list.add(i);
            }
        }
        //Finding(nums,list);

        return list;

        // Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    private static void Finding(int[] nums, List<Integer> list) {
        int exp = 1 ;
        for (int num : nums) {
            while(num > exp){
                list.add(exp);
                exp++;
            }
            exp = num + 1;
        }
        while (exp <= nums.length){
            list.add(exp);
            exp++;
        }

    }

    private static void insertion(int[] nums) {
        for (int i = 0; i < nums.length - 1 ; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(nums[j]<nums[j-1]){
                    swap(nums,j,j-1);
                }else break;
            }
        }
    }
    private static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }
    public static int binarySearchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ( end - start ) /2 ;

            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                end = mid - 1 ;
            else
                return mid;
        }
        return -1;
    }*/
}
// insertion sort is more complex we will use merge or quick sort