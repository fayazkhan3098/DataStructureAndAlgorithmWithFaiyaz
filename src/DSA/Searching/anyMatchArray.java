package DSA1.searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class anyMatchArray {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>();
        arr1.add(5);
        arr1.add(6);
        arr1.add(7);
        arr1.add(8);
        arr1.add(9);
        arr1.add(10);
        arr1.add(11);
        arr1.add(12);
        arr1.add(13);
        arr1.add(14);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(5);
        arr2.add(6);
        arr2.add(7);
        arr2.add(8);
        arr2.add(9);
        arr2.add(10);
        arr2.add(11);
        arr2.add(12);
        arr2.add(13);
        arr2.add(14);
        arr2.add(15);
        arr2.add(16);
        arr2.add(17);
        int[] arr3 = {10, 20, 30, 40, 50, 60, 70};
        int[] arr4 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //System.out.println(missingNumbers1(arr3,arr4));
        System.out.println(missingNumbers(arr1,arr2));
    }
    public static List<Integer> missingNumbers1(int[] arr, int[] brr) {
        HashMap<Integer, Boolean> HM = new HashMap<>();
        List<Integer> crr = new ArrayList<>();
        for (int i = 0; i < brr.length; i++)
            HM.put(brr[i],true);
        for (int j = 0 ; j < arr.length ; j++) {
                if (!HM.containsKey(arr[j])) {
                    crr.add(arr[j]);
                                                                                                                     }
            }

        return crr;
    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        // Write your code here
        List<Integer> crr = new ArrayList<>();

        for(int element : arr){
            crr = brr.stream().map(i -> i == element?element:0).collect(Collectors.toList());
            System.out.println(",");
        }
        return crr;
    }
}
