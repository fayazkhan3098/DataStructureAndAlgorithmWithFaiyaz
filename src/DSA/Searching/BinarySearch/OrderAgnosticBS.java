package DSA1.searching.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] Aarr = {-6, -3, -1, 0, 5, 36, 40, 50, 56, 69, 75, 80, 91, 100};
        int[] Darr = {100, 91, 80, 75, 69, 56, 50, 40, 36, 5, 0, -1, -3, -6};
        int target = 40;
        long time1 = System.nanoTime();
        System.out.println("Ascending Array :"+orderAgnosticBinarySearch(Aarr,target));
        long time2 = System.nanoTime();
        System.out.println("Descending Array :"+orderAgnosticBinarySearch(Darr,target));
        long time3 = System.nanoTime();
        System.out.println(time2 - time1 + " " + (time3 - time2) );
    }
    public static int orderAgnosticBinarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
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
