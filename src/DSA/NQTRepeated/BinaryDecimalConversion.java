package DSA1.NQTRepeated;

import java.util.Scanner;

public class BinaryDecimalConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DecToBin(10);


    }

    private static void DecToBin(int n) {
         int[] binary = new int[35];
         int count =0 ;
         while(n > 0){
             binary[count++] = n % 2 ;
             n = n / 2;
         }
         toggling(binary, count);
        //for(int i = count-1 ; i >= 0 ; i--)
          //  System.out.print(binary[i]);

    }
    private static void toggling(int[] arr,int len){
        for(int i = len-1 ; i >= 0 ; i--){
            arr[i] = 1^arr[i];
            System.out.print(arr[i]+" ");
        }
        binToDec(arr,len);
    }
    private static void binToDec(int[] arr,int len){
        int sum=0, mul = 1;
        for (int i = 0 ; i < len ; i++){
            sum += mul*arr[i];
            mul *= 2;
        }
        System.out.println("\n"+sum);
    }

}
/*
* TCS NQT Coding Question 2022 – September Day 1 – Slot 1
Problem Statement –

Joseph is learning digital logic subject which will be for his next semester. 
* He usually tries to solve unit assignment problems before the lecture. 
* Today he got one tricky question. The problem statement is “A positive integer has been given as an input. 
* Convert decimal value to binary representation. 
* Toggle all bits of it after the most significant bit including the most significant bit. 
* Print the positive integer value after toggling all bits”.

Constrains-

1<=N<=100

Example 1:

Input :

10  -> Integer

Output :

5    -> result- Integer

Explanation:

Binary representation of 10 is 1010. After toggling the bits(1010), 
* will get 0101 which represents “5”. Hence output will print “5”.
* */
