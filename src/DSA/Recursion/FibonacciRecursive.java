package DSA.Recursion;

public class FibonacciRecursive {
    public static void main(String[] args) {
        // 0, 1, 1, 2, 3, 5, 8, 13......
        int answer = fibonacci(2);//?
        int answer1 = fib(2);
        System.out.println(answer+" "+answer1);
    }

    private static int fibonacci(int i) {
        if (i < 2)return 1;
        return fibonacci(i-1)+fibonacci(i-2);
    }
    public static int fib(int n) {
        if(n == 2|| n == 1)return 1;
        if(n == 0)return 0;
        return fib(n-1)+fib(n-2);
    }
}
