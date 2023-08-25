package DSA.SortingArrays;
// https://leetcode.com/problems/set-mismatch/submissions/
// google
class SetMismatchCS {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1 ;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else i++;
        }
        int[] res = new int[2];
        for(int j = 0 ; j < arr.length ; j++){
            if(arr[j] != j+1){
                res[0]= arr[j];
                res[1] = j+1;
            }
        }


        return res; 
    }
    public void swap(int[] arr, int start,  int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}