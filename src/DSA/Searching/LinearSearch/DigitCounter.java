package DSA1.searching.LinearSearch;

public class DigitCounter {
    public static void main(String[] args) {
        int[] arr = {12, 365, 4654, 45621, 56478, 2, 23, 65, 556};
        long time1 = System.nanoTime();
        System.out.println("numbers which contain Even number of digits are :"+ Even(arr));
        System.out.println("numbers which contain Odd number of digits are :"+ Odd(arr));
        long time2 = System.nanoTime();
        System.out.println("numbers which contain Even number of digits are :"+ Even1(arr));
        System.out.println("numbers which contain Odd number of digits are :"+ Odd1(arr));
        long time3 = System.nanoTime();
        System.out.println("1-2:"+ (time2-time1));
        System.out.println("2-3:"+ (time3-time2));
    }
    //Count even is a number
    static int Even(int[] arr){
        int count = 0;
        for (int element : arr  ) {
            if(Digitcounter(element) % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
    //Count odd is a number
    static int Odd(int[] arr){
        int count = 0;
        for (int element : arr  ) {
            if(Digitcounter(element) % 2 != 0 ){
                count++;
            }
        }
        return count;
    }
    // using log10 function
    static int Even1(int[] arr){
        int count = 0;
        for (int element : arr  ) {
            if(Digitcounter2(element) % 2 == 0 ){
                count++;
            }
        }
        return count;
    }
    //Count odd is a number
    static int Odd1(int[] arr){
        int count = 0;
        for (int element : arr  ) {
            if(Digitcounter2(element) % 2 != 0 ){
                count++;
            }
        }
        return count;
    }
   // Count no of digits in a number
    static int Digitcounter(int element){
        int count = 0;
        if(element < 0)
            element *= -1;
        if(element == 0)
            return 1;
        while(element>0){
            count++;
            element=element/10;
        }
        return count;
    }
    // this function will be 95% faster than Digitcounter1 function
    static int Digitcounter2(int element){
        if(element < 0)
            element *= -1;
        return (int)(Math.log10(element));

    }
}
