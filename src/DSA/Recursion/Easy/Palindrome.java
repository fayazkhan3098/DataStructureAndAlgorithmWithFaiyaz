package DSA.Recursion.Easy;



public class Palindrome {
    public static void main(String[] args) {
        System.out.println(ispalind(123431));
        System.out.println(ispalind(1234321));
    }

    private static boolean ispalind(int i) {
        return i == rev(i);
    }

    private static int rev(int i) {
        int digits = (int) Math.log10(i);
        return helper(i,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10 == n)return n;
        return (int) ((n%10) *Math.pow(10,digits)+helper(n/10,digits-1));
    }
}
