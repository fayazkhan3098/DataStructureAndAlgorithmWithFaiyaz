package DSA.Recursion.Arrays_Sorting.RecursiveSorting;
// https://leetcode.com/problems/binary-search/submissions/
class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        System.out.println(search(nums,target,0,nums.length-1));
    }
    public static int search(int[] nums, int target,int start, int end) {
        if(start>end)return -1;
        int mid = end + (start - end) / 2;
        if(nums[mid]==target)return mid;
        if (nums[mid] < target)return search(nums,target,mid+1,end);
        return search(nums,target,start,mid-1);
    }
}