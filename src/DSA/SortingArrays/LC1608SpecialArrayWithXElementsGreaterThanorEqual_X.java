package DSA.SortingArrays;

import java.util.Arrays;
import java.util.stream.IntStream;
// https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
class LC1608SpecialArrayWithXElementsGreaterThanOrEqualX       {
    public static void main(String[] args) {
        int[] arr = {3,5,4};
        System.out.println(specialArray(arr));
    }
    public static int specialArray(int[] nums) {
        int[] arr = IntStream.range(0,nums.length+1).toArray();
        for(int ele : arr){
            int count = (int) Arrays.stream(nums).filter(num -> num >= ele).count();
            if(count == ele)return count;
        }
        return -1;
    }
}
