package DSA.SortingArrays;
// https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
class LC1464MaximumProductOfTwoElementsArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,2};
        System.out.println(maxProduct(arr));
    }
    public static int maxProduct(int[] nums) {
        int max1 = 0;
        int max2 = 0;
        for(int num : nums) {
            if(num > max1) {
                if(num > max2) {
                    max1 = max2;
                    max2 = num;
                }else max1 = num ;
            }
        }
        System.out.println(max1);
        System.out.println(max2);
        return (max1-1)*(max2-1);
    }
}