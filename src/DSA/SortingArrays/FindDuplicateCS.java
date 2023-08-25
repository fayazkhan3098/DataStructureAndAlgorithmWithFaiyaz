package DSA.SortingArrays;
// https://leetcode.com/problems/find-the-duplicate-number/description/?source=submission-ac
// Amazon, Microsoft
class FindDuplicateCS {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4,2,2},//[5, 6]
                {3,1,3,4,2},// [4]
                {1},
                {1,1},
                {4,3,2,7,2,3,1}
        };

        for (int[] ele : arr) {

            System.out.println(findDuplicate(ele));
            System.out.println(findDuplicateKK(ele));
        }

    }
    public static int findDuplicate(int[] arr) {
        int i = 0;
        while(i < arr.length - 1){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != (j+1) )
                return arr[j];
        }
        return 0;
    }
    public static void swap(int[] arr, int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    // Another Solution
    public static int findDuplicateKK(int[] arr) {
        int i = 0;
        while(i < arr.length ){
            if(arr[i] != (i+1) ) {

                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}