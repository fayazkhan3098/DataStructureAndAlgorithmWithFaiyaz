package DSA.Recursion.Arrays_Sorting;

public class RotatedBinarySearchRecursive {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        int[] arr2 = {6, 7, 1, 2, 3, 4, 5};
        int target = 4;
        System.out.println(RBSR(arr,target,0,arr.length-1));
        System.out.println(RBSR(arr2,target,0,arr2.length-1));
    }

    private static int RBSR(int[] arr, int target, int s, int e) {
        if (s>e)return -1;
        int mid = s + (e-s)/2;
        if(arr[mid]==target)return mid;
        if(arr[s]<=arr[mid]) {
            if (target >= arr[s] && target <= arr[mid]) {
                return RBSR(arr,target,s,mid-1);
            }else return RBSR(arr,target,mid+1,e);
        }
        if(target >= arr[mid] && target<= arr[e]) return RBSR(arr,target,mid+1,e);
        return RBSR(arr,target,s,mid-1);
    }
}
