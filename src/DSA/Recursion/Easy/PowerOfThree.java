package DSA.Recursion.Easy;

public class PowerOfThree {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
        System.out.println(ispo(27));
        System.out.println(isPowerOfThree(2));
        System.out.println(ispo(2));
    }
    public static boolean isPowerOfThree(int n) {
        if(n <= 0)return false;
        if(n == 1) return true;
        return n% 3 == 0 && isPowerOfThree(n/3);
    }
    public static boolean ispo(int n){
        if(n <=0)return false;
        while(n%3==0) {
            n/=3;
        }
        return n==1;
    }
}
