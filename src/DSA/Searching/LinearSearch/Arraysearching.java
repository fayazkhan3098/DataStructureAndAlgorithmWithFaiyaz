package DSA1.searching.LinearSearch;

public class Arraysearching {
    public static void main(String[] args) {
        int[] arr= new int[]{22, 55, 33, 52, 66, 80};
        int target = 55;
        System.out.println(linearSearch(arr,target));
        System.out.println(linearSearch2(arr,target));
        System.out.println(linearSearch3(arr,target));
        System.out.println(linearSearch4(arr,target,1,4));
        System.out.println(linearSearch5(arr));
        System.out.println(linearSearch6(arr));
    }
    //linearSEarch to return index of target element
    static int linearSearch(int[] arr, int target){
        int index = -1;
        if (arr.length == 0){
            return index;
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return index;
    }
    //linearSearch to give element if found
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return Integer.MAX_VALUE;
        }
        for(int element : arr) {
            if(element == target)
                return element;
        }
        return Integer.MAX_VALUE;
    }
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }
        for(int element : arr) {
            if(element == target)
                return true;
        }
        return false;
    }
    // Linear Search in a range
    static int linearSearch4(int[] arr, int target, int start, int end){
        int index = -1;
        if (arr.length == 0){
            return index;
        }
        for(int i = start; i <= end; i++) {
            if(arr[i] == target)
                return i;
        }
        return index;
    }

    // finding min from array using Linear search
    //assume array length != 0
    static int linearSearch5(int[] arr){
      int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(res > arr[i])
                res = arr[i];
        }
        return res;
    }
    // finding max from array using Linear search
    //assume array length != 0
    static int linearSearch6(int[] arr){
        int res = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(res < arr[i])
                res = arr[i];
        }
        return res;
    }
}
