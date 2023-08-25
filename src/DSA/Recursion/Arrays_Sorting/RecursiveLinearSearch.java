package DSA.Recursion.Arrays_Sorting;

import java.util.ArrayList;
import java.util.List;

public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int[] arr={3, 5, 3, 6, 4, 12, 10, 8, 15};
        int target = 3;
//        System.out.println("From Zero index:");
//        System.out.println(isFound(arr,target,0));
//        System.out.println(FindIndex(arr,target,0));
//        System.out.println("From Last Index");
//        System.out.println(isFoundLast(arr,target,arr.length-1));
//        System.out.println(FindIndexLast(arr,target,arr.length-1));
//        FindAllIndex(arr,target,0);
//        System.out.println("target found on these locations: "+list);
//        System.out.println("target found on these locations: "+FindAllIndex1(arr,target,0,new ArrayList<>()));
        System.out.println(FindAllIndex2(arr,target,0));
    }

    public static boolean isFound(int[] arr, int target, int index) {
        if(index == arr.length)return false;
        return arr[index]==target || isFound(arr,target,index+1);
    }

    public static int FindIndex(int[] arr,int target, int index) {
        if(index==arr.length)return -1;
        if(arr[index]==target)return index;
        else return FindIndex(arr,target,index+1);
    }

    public static boolean isFoundLast(int[] arr, int target, int index) {
        if(index == -1)return false;
        return arr[index]==target || isFoundLast(arr,target,index-1);
    }

    public static int FindIndexLast(int[] arr,int target, int index) {
        if(index==-1)return -1;
        if(arr[index]==target)return index;
        else return FindIndexLast(arr,target,index-1);
    }

    static List<Integer> list =new ArrayList<>();
    public static void FindAllIndex(int[] arr,int target, int index) {
        if(index==arr.length)return;
        if(arr[index]==target)list.add(index);
        FindAllIndex(arr,target,index+1);
    }
    // what if we don't want to declare arraylist outside of function
    public static List<Integer> FindAllIndex1(int[] arr,int target, int index, List<Integer> list) {
        if(index==arr.length)return list;
        if(arr[index]==target)list.add(index);
        return FindAllIndex1(arr,target,index+1,list);
    }
    public static List<Integer> FindAllIndex2(int[] arr,int target, int index) {
        List<Integer> list = new ArrayList<>();
        if(index==arr.length)return list;
        if(arr[index]==target)list.add(index);
        list.addAll(FindAllIndex2(arr,target,index+1));
        return list;
    }
}
