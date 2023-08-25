package DSA1.searching.BinarySearch;

public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {3,5,1};
        int target = 3 ;
        // System.out.println(Findpivot(arr));
        // System.out.println(BinarySearch(arr,3,0,2));
        System.out.println(SearchInRotated(arr,target));
        System.out.println(search(arr,target));
    }
    // in this program array should always have unique values duplicate elements are not allowed
    static int SearchInRotated(int[] arr, int target){
        int pivot = Findpivot(arr);
        if (pivot == -1)
            return BinarySearch(arr,target,0,arr.length-1);
        if(target == arr[pivot]){
            return pivot;
        }
        if(target >= arr[0])
            return BinarySearch(arr, target, 0,pivot-1);
        else
            return BinarySearch(arr, target, pivot+1,arr.length-1);


    }
    static int Findpivot(int[] arr){
        int start = 0 ;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start) / 2 ;
            // 4 possible cases
            if(mid < end && arr[mid]> arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1;
            }else {
                start = mid +1;
            }
        }
        return -1;
    }
    static int BinarySearch(int[]arr, int target, int start, int end){

        while(start <= end){
            int mid = start + ( end - start ) / 2 ;
            if(arr[mid] < target){
                start = mid + 1 ;
            } else if (arr[mid] > target) {
                end = mid - 1 ;
            }else {
                return mid;
            }
        }

        return -1;
    }
    // this program uses a standard binary search algorithm to find the target element in a rotated
    // sorted array. It keeps track of the start and end indices and updates them based on comparisons
    // with the mid element. The key point in this approach is to identify
    // which portion of the array is sorted and perform binary search on that portion.
    // This approach has a time complexity of O(log n) and space complexity of O(1).
    static  int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        int mid;
        while(start<=end){
            mid=start+(end-start)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[start]<=nums[mid]){
                if(nums[start]<=target && target<nums[mid])
                    end=mid-1;
                else
                    start=mid+1;
            }
            else{
                if(nums[end]>=target && target>nums[mid])
                    start=mid+1;
                else
                    end=mid-1;
            }
        }
        return -1;

    }
    //Both programs have the same time and space complexity, and they should yield similar results
    // for finding the target element in a rotated sorted array. The choice between the two approaches
    // may depend on personal preference or specific requirements of the problem.
}
