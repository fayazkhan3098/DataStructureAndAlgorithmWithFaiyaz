package DSA1.searching.BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] sorted_arr = {22, 32, 65, 66, 69, 71, 74, 80, 90};
        int target = 68;
        long time1 = System.nanoTime();
        System.out.println("index : "+ Ceil(sorted_arr, target));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

    }
    // floor of a number = Greatest element in the array Smaller than or equal to target element
    public static int Ceil(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        //if target floor element is smaller than first element of the array then return -1
        if(target < arr[0])
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
        return arr[end ];
    }
}
