package DSA1.searching.BinarySearch;

public class Mountainarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 7, 4, 3, 0};
        System.out.println(PeakIndexofMA(arr));
    }
    static int PeakIndexofMA(int[] arr){
        int start = 0 ;
        int end = arr.length -1 ;
        while(start < end){
            int mid = start + ( end - start ) / 2 ;
            if(arr[mid] < arr[mid+1]){
                // it means that we are in ascending array and we will find on RHS of array
                start = mid + 1 ;
            }else{
                end = mid ;
                // their might be a chance that mid could be our peak element thats why we didnt wrote end = mid -1

            }
        }
        return start ;// return start or end both will lie on the same position of the element
    }
}
