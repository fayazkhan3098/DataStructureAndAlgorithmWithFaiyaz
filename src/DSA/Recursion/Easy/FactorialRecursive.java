package DSA.Recursion.Easy;

public class FactorialRecursive {
    public static void main(String[] args) {
        System.out.println(fact(5));//120
    }
    /*
    * how recursion work for factorial
    * 5! = 5 * 4 * 3 * 2 *1
    * fact(5) = 5 * fact(4)
    *               = 4 * fact(3)
    *                       = 3 * fact(2)
    *                               = 2 * fact(1)
    * so we can say that fact(5) = n * fact(n-1);
    * Similarly you can also add numbers
    * */
    public static int fact(int n){
        if (n <= 1)return 1;
        return n * fact(n-1);
    }
}
