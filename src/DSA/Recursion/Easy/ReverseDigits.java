package DSA.Recursion.Easy;

public class ReverseDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(rev(n));
    }

    private static int rev(int n) {
        // here we are getting to know how many digits are their in the number n
        int digits = (int)Math.log10(n);
        // then calling function helper
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
    if(n%10 == n)return n; // if only one digit is present in the n then it will return n only
        // remainder of n is multiplied by pow of 10^number of digits recursively we decrement value of digits
        // 1234 = 4 * 10^4 + helper(123,3)
        // 4 * 1000 = 4000
        // 3 * 100 + 4000 = 4300
        // 2 * 10 + 4300 = 4320
        // 1 * 1 + 4320 = 4321
    return (int) ((n%10)* Math.pow(10,digits) + helper(n/10,digits-1));
    }
}
