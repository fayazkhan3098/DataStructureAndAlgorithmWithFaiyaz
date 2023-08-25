/*
* TCS NQT Coding Question Day 1 Slot 2 – Question 2
Airport security officials have confiscated several item of the passengers at
the security check point. All the items have been dumped into a huge box (array).
Each item possesses a certain amount of risk[0,1,2].
Here, the risk severity of the items represent an array[] of N number of integer values.
The task here is to sort the items based on their levels of risk in the array.
The risk values range from 0 to 2.

Example :

Input :

7  -> Value of N

[1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1],
while input each element is separated by new line.

Output :

0 0 0 1 1 2 2  -> Element after sorting based on risk severity

Example 2:

input : 10  -> Value of N

[2,1,0,2,1,0,0,1,2,0] -> Element of arr[0] to arr[N-1],
while input each element is separated by a new line.

Output :

0 0 0 0 1 1 1 2 2 2  ->Elements after sorting based on risk severity.

Explanation:

In the above example, the input is an array of size N consisting of only 0’s, 1’s and 2s.
The output is a sorted array from 0 to 2 based on risk severity.
* */
package DSA1.NQTRepeated;

import java.util.Arrays;
import java.util.Scanner;

public class AirportRiskSeverity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Items In that Box: ");
        int N = sc.nextInt();
        int[] RiskArray = new int[N];
        for (int i = 0; i < N; i++) {
            RiskArray[i] = sc.nextInt();
        }
        System.out.println("\n Sorted Risk Severity: "+Arrays.toString(SeviarateRisk(RiskArray, N)));
    }

    private static int[] SeviarateRisk(int[] riskArray, int n) {
        // this is a simple selection sort algorithm
        for (int i = 0; i < n ; i++) {
            int last = n - i -1 ;
            int max = FindMax(riskArray, last);
            swap(riskArray,max,last);
        }
        return riskArray;
    }

    private static int FindMax(int[] riskArray, int last) {
        int max = 0;
        for (int i = 1; i <= last; i++) {
            if(riskArray[max]<riskArray[i])max = i ;
        }
        return max;
    }

    private static void swap(int[] riskArray, int max, int last) {
        int temp = riskArray[max];
        riskArray[max] = riskArray[last];
        riskArray[last] = temp;
    }

}
