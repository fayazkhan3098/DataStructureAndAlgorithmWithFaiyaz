package DSA1.SortingArrays;

public class ThirdMaxNum {

// finding third maximum number
    public static void main(String[] args) {
        int[][] arrays = {{3,2,1},{1,2},{2,2,3,1},{5,2,2},{2,2}};

        int c = 1;
        for (int[] ele : arrays) {
            System.out.println(c+".1: "+thirdMax(ele));
            System.out.println(c+".2: "+thirdMax2(ele));
            System.out.println(c+".3: "+thirdMax3(ele));
            c++;
        }
    }

        public static int thirdMax(int[] nums) {

            int numlen = nums.length;
            boolean swapped;
            for(int i = 0 ; i < numlen - 1 ; i++){
                swapped = false ;
                for(int j = 1 ; j < numlen - i ; j++){
                    if(nums[j]<nums[j-1]){
                        int temp = nums[j];
                        nums[j] = nums[j-1];
                        nums[j-1] = temp;
                        swapped = true;
                    }
                }
                if(!swapped)
                    break;
            }
            if(numlen < 3)
                return nums[numlen -1];
            else
                return thirdlargestelement(nums, numlen);
        }
        public static int thirdlargestelement(int[] arr, int n){
            int distinct = 1 ;
            int thirdlar = arr[n-1];
            for(int i = n-2 ; i >= 0 ; i--){ // 1 2 2 3
                if(arr[i] != arr[i+1]){
                    distinct++;
                    if(distinct == 3){
                        return arr[i];
                    }
                }
            }

            return thirdlar;
        }
// by one of the user
        public static  int thirdMax2(int[] nums) {
            int u =nums.length-1;
            int count = 0;

            for(int i=0;i<nums.length;i++){
                for(int j=1+i;j<nums.length;j++){
                    if(nums[i] < nums[j]){
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
            int max = nums[0];
            if(nums.length > 2){
                for(int i=0; i<nums.length; i++){
                    if(nums[i] < max && count <2 && i != 0 && nums[i] != max){
                        max = nums[i];
                        count++;
                    }
                }
            }

            if(count == 2){
                return max;
            }
            return nums[0];
        }


        public static int thirdMax3(int[] nums) {
            Integer firstMax = null;
            Integer secondMax = null;
            Integer thirdMax = null;

            for (Integer num : nums) {
                if (num.equals(firstMax) || num.equals(secondMax) || num.equals(thirdMax)) {
                    continue;
                }

                if (firstMax == null || num > firstMax) {
                    thirdMax = secondMax;
                    secondMax = firstMax;
                    firstMax = num;
                } else if (secondMax == null || num > secondMax) {
                    thirdMax = secondMax;
                    secondMax = num;
                } else if (thirdMax == null || num > thirdMax) {
                    thirdMax = num;
                }
            }

            return thirdMax != null ? thirdMax : firstMax;
        }


}
