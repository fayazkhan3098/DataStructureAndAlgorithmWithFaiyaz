package DSA.Recursion.Arrays_Sorting.RecursiveSorting;

public class IsSorted {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[]{2, 6, 7, 9, 10}));
        System.out.println(isSorted(new int[]{-2, 6, 4, 7, 9, 10}));
    }
    public static boolean isSorted(int[] arr){
        return iSsorted(arr,0);
    }

    private static boolean iSsorted(int[] arr, int i) {
        if(i >= arr.length-1)return true;
        return arr[i]<arr[i+1] && iSsorted(arr,i+1);
    }
}
