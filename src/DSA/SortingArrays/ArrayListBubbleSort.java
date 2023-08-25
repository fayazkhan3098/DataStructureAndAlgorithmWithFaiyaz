package DSA1.SortingArrays.Algorithms;

import java.util.*;

public class ArrayListBubbleSort {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of sub arrays you will insert: ");
        int sizea = sc.nextInt();
        for (int i = 0; i < sizea; i++) {
            List<Integer> sub = new ArrayList<>();
            System.out.println("Enter the number of element of subArray "+(i+1)+": ");
            int subnum = sc.nextInt();
            for(int j = 0 ; j < subnum ; j++){
                System.out.println("Enter element "+(j+1)+": ");
                sub.add(sc.nextInt());
            }
            arr.add(sub);
        }
        for (List<Integer> ele: arr ) {
            countSwaps(ele);
        }

    }
    public static void countSwaps(List<Integer> a) {
        // Write your code here
        boolean swapped ;
        int Swapped = 0;
        for(int i = 0 ; i < a.size() ; i++){
            swapped = false;
            for(int j = 1 ; j < a.size() - i ; j++){
                if(a.get(j)<a.get(j-1)){
                    int temp = a.get(j);
                    a.set(j,a.get(j-1));
                    a.set(j-1, temp);
                    Swapped+= 1;
                    swapped = true;
                }
            }
            if(!swapped)
                break;
        }
        System.out.println("Array is sorted in "+Swapped+" swaps.");
        System.out.println("First Element: "+a.get(0)+"\nLast Element: "+a.get(a.size() -1));

    }


}

