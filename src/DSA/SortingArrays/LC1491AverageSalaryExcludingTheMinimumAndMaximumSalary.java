package DSA.SortingArrays;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class LC1491AverageSalaryExcludingTheMinimumAndMaximumSalary {
    public static void main(String[] args) {
        int[] arr = {1000,2000,3000};
        System.out.println(average(arr));
    }
    public static double average(int[] salary) {
        int min = salary[0];
        int max = salary[0];
        long sum = 0 ;
        for(int ele : salary) {
            sum += ele ;
            if(min > ele) {
                min = ele;
            }
            if(max < ele) {
                max = ele;
            }
        }
        return (double) (sum - (min + max)) /(salary.length-2);
    }
}