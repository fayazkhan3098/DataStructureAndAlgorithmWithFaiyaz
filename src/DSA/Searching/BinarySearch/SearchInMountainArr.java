package DSA1.searching.BinarySearch;

public class SearchInMountainArr {

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 6, 8, 7, 4, 3, 0};
        int target = 4;
        System.out.println("index of 4 is : "+SearchinMountain(arr, target));
    }
    static int SearchinMountain(int[] arr, int target){
        int peakindex = PeakIndexofMA(arr);
        int targetindex = orderAgnosticBinarySearch(arr, target, 0 , peakindex);
        if(targetindex != -1)
            return targetindex;
        return orderAgnosticBinarySearch(arr, target, peakindex+1,arr.length-1);
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
    public static int orderAgnosticBinarySearch(int[] arr, int target, int start, int end){

        boolean isAsc =arr[start] < arr[end];

        while(start <= end){
            int mid = start + ( end - start ) /2 ;
            if(arr[mid] == target)
                return mid;
            if(isAsc){
                if(arr[mid] > target)
                    end = mid - 1 ;
                else
                    start = mid + 1;
            }else {
                if(arr[mid] < target)
                    end = mid - 1 ;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
