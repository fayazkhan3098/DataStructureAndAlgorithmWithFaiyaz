package DSA1.SortingArrays;
/*
*  this code uses a simple selection sort-like approach to find the kth largest element by repeatedly finding the maximum element and marking it as the smallest value so that it is ignored in the next iteration. However, note that this approach has a time complexity of O(k * n) in the worst case, which can be inefficient for large values of k. There are more efficient algorithms, such as quickselect or priority queues, to find the kth largest element in O(nlogk) or O(n + klogn) time complexity, respectively.
* */
public class KthMaxNum {
    public static void main(String[] args) {
        int[] arr = {5,2,4,1,3,6,0};
        int k = 4;
        System.out.println(findKthLargest(arr, k));
    }
    public static int findKthMaxCS(int[] arr, int k){
        int answer = 0;
        int i =0 ;
        int length = arr.length;
        while(i < length){
            int correct = arr[i] - 1;

        }

        return answer;
    }
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        int max = 0;
        int ind = 0;
        if(len < 2 )
            return nums[0];
        for(int i = 0; i < k; i++){
            max = nums[0];
            ind = 0;
            for(int j = 1 ; j < len  ; j++){
                if(nums[j]>max){
                    max = nums[j];
                    ind = j;
                }
            }
            nums[ind]=Integer.MIN_VALUE;
        }
        return max;
    }
}
