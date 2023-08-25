package DSA1.searching.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Firstandlastoccurence {
    public static void main(String[] args) {
    int[] arr = {2, 3, 3, 3, 4, 4, 6, 6, 6, 6, 6, 8, 9};
    int target = 6;
        System.out.println(Arrays.toString(Searchrange(arr, target)));
    }
    static int[] Searchrange(int[] arr,int target ){
        int [] ans = {-1,-1};
        ans[0] = Search(arr,target,true);
        if(ans[0] != -1){
            ans[1] = Search(arr, target, false);
        }
        return ans;
    }

    private static int Search(int[] arr, int target, boolean findstartindex) {
        int ans =-1;
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findstartindex){
                    end = mid -1 ;
                }else{
                    start = mid + 1 ;
                }
            }
        }

        return ans;
    }
}
