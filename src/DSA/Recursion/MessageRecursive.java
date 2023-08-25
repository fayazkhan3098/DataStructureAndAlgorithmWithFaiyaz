package DSA.Recursion;

public class MessageRecursive {
    public static void main(String[] args) {
        message(5);
    }

    private static void message(int n) {
        if(n==0)return; // base condition to end recursion
        System.out.println("Hello World!");
        message(n-1);
    }
// this will print :
//    Hello World!
//    Hello World!
//    Hello World!
//    Hello World!
//    Hello World!
}
