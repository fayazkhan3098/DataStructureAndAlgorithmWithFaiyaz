package DSA1.searching.BinarySearch;

public class binarySearchArray {
    public static void main(String[] args) {
        int[] sortedarr = {22, 32, 65, 66, 69, 71, 74, 80, 90};
        int target = 74;
        long time1 = System.nanoTime();
        System.out.println("index : "+ binarySearchElement(sortedarr, target));
        long time2 = System.nanoTime();
        System.out.println(time2 - time1);

    }
    public static int binarySearchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + ( end - start ) /2 ;

            if(arr[mid] < target)
                start = mid+1;
            else if(arr[mid] > target)
                end = mid - 1 ;
            else
                return mid;
        }
        return -1;
    }
}
