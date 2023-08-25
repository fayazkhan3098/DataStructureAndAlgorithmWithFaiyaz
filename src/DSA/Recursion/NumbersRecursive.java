package DSA.Recursion;

public class NumbersRecursive {
    public static void main(String[] args) {
        numbers(5);
        numberswithtail(1);
        // these both functions will print 1-5 numbers
    }

    private static void numberswithtail(int n) {
        if(n > 5)return;
        System.out.println(n);
        numberswithtail(n+1);
    }

    private static void numbers(int i) {
        if(i==0)return;
        numbers(i-1); // tail recursion
        System.out.println(i);
    }
}
