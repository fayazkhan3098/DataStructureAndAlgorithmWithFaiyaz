package DSA1.searching.BinarySearch;
// we cant use array.length function in this search function as array length is infinite
// we use opposite approach of binary search to find chunk where our target array lies
// this question were asked by amazon
public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 9, 10, 15, 18, 20, 23, 25, 27, 30, 31, 36, 39, 41, 45, 48, 51, 55, 58, 60};
        int target = 25;
        System.out.println(rangefinder(arr,target));
    }

    static int rangefinder(int[] arr, int target){
        // we are starting with a 0-1 chunk of range on array
        int start = 0 ;
        int end = 1 ;
        while (target > arr[end]){
            int temp = end + 1 ; // this is my new start
            // here we are doubling our 0-1 chunk to itd double
            end = end + (end - start +1 ) * 2 ;
            start = temp ;
        }
        return BinarySearch(arr,target,start,end);
    }
    static int BinarySearch(int[] arr, int target, int start, int end){
        while( start < end ){
            int mid = start + ( end - start ) /2;
            if(arr[mid] < target){
                start = mid + 1 ;
            } else if (arr[mid] > target) {
                end = mid - 1 ;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
