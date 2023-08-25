package DSA.Strings;

import java.util.Arrays;

// https://leetcode.com/problems/reverse-string/
public class ReverseStringLC {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(reverseString(new char[]{'h','e','l','l','o'})));
    }
    public static char[] reverseString(char[] s) {
        int len = s.length;
        int left = 0 ;
        int right = len-1;
        while(left<right){
            swap(s,left,right);
            left++ ;
            right--;
        }
        return s;
    }
    public static void swap(char[] arr, int left, int right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
