package DSA.Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);//54321
        funrev(5);//12345
    }
    public static void fun(int n) {
        if(n==0)return;
        System.out.println(n);
        fun(n-1);
    }
    public static void funrev(int n) {
        if(n==0)return;
        funrev(n-1);
        System.out.println(n);
    }
}
