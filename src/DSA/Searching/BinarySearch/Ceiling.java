package DSA1.searching.BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] sorted_arr = {22, 32, 65, 66, 69, 71, 74, 80, 90};
        int target = 91;
        long time1 = System.nanoTime();
        System.out.println("index : "+ Ceil(sorted_arr, target));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

    }
    // ceiling of a number = Smallest element in the array greater than or equal to target element
    public static int Ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //if target ceiling element is greater than last element of the array then return -1
        if(target > arr[end])
            return -1;
        while(start <= end){
            int mid = start + ( end - start ) /2 ;

            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                end = mid - 1 ;
            else
                return mid;
        }
        return arr[start];
    }
}
