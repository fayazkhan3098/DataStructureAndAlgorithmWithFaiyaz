package DSA.SortingArrays;

import java.util.Arrays;

//  https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
class LC1365HowManyNumbersAreSmallerThanTheCurrentNumber {
    public static void main(String[] args) {
        int[][] arrays = {
                {8,1,2,2,3},
                {6,5,4,8},
                {7,7,7,7}
        };
        /* [4, 0, 1, 1, 3]
            [2, 1, 0, 3]
            [0, 0, 0, 0]*/
        for (int[]arr:arrays ) {
            System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));

        }
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ret = new int[nums.length];
        for(int num = 0; num < nums.length; num++) {
            int count = 0;
            for(int num2 : nums) {
                if(num2 < nums[num]) {
                    count++;
                }
            }
            ret[num] = count;
        } 
        return ret;
    }
}