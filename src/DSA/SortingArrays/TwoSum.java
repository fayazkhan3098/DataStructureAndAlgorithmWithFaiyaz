package DSA.SortingArrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/description/
     class TwoSum {
    
        public static void main(String[] args) {
            int[][] arr = {
                    {2,7,11,15},
                    {3,2,4},
                    {3,3}
            };
            int[] target = {9,6,6};
            int i = 0;
            for(int[] array : arr ){
                System.out.println(Arrays.toString(twoSum(array,target[i])));
                System.out.println(Arrays.toString(optimized_twoSum(array,target[i])));
                i++;
            }
        }
    
            public static int[] twoSum(int[] nums, int target) {
                int[] arr = new int[2];
                for(int i = 0 ; i < nums.length-1 ; i++) {
                    for(int j = i+1 ; j < nums.length ; j++) {
                        if(nums[i]+nums[j] == target){
                            arr[0] = i ;
                            arr[1] = j ;
                            break;
                        }
                    }
                }
                return arr;
            }
    
    
            public static int[] optimized_twoSum(int[] nums, int target) {
                Map<Integer, Integer> numToIndex = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                    if (numToIndex.containsKey(target - nums[i])) {
                        return new int[] {numToIndex.get(target - nums[i]), i};
                    }
                    numToIndex.put(nums[i], i);
                }
                return new int[] {};
            }
    
    
    }