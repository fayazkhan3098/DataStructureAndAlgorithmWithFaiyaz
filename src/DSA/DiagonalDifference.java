package DSA1;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(11);
        arr1.add(2);
        arr1.add(4);
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(4);
        arr2.add(5);
        arr2.add(6);
        List<Integer> arr3 = new ArrayList<>();
        arr3.add(10);
        arr3.add(0);
        arr3.add(-12);
        arr.add(0,arr1);
        arr.add(0,arr2);
        arr.add(0,arr3);
        //System.out.println(diagonalDifference(arr,3));
        plusMinus(arr3);
        /*
        * 11 2 4
        * 4  5 6
        * 10 8 -12
        *
        * [11+ 5 -12 ] - [4 + 5 + 10 ] = 15
        * */

    }
    public static int diagonalDifference(List<List<Integer>> arr, int n) {
        int primaryDngl = 0;
        int secDngl = 0;
        for(int i = 0; i < n ; i++){
            primaryDngl += arr.get(i).get(i);
            }
        for(int j = n-1 ; j >= 0 ; j--){
            secDngl += arr.get(n-1-j).get(j);
        }
        return Math.abs(primaryDngl - secDngl);
        // Write your code here

    }
    public static void plusMinus(List<Integer> arr) {
        int[] pos = {0};
        int[] neg = {0};
        int[] zer = {0};
        arr.stream().map(i->i == 0 ? zer[0]++ :(i > 0)? pos[0]++ : neg[0]++);
        // Write your code here
        //float pos = pos[0]/arr.size();
        System.out.println(pos[0] );
        System.out.println(neg[0]);
        System.out.println(zer[0]);


    }
}

