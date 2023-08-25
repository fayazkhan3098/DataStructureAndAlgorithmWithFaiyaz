package DSA.Recursion.Easy;

public class AdditionOfDigits {
    public static void main(String[] args) {
        System.out.println(digsum(1234));//10
    }
    /*
    * Addition of digits mean to add digits of a Number like
    * sumdig(1234) = 1+2+3+4 = 10
    * we can find each digit by taking its modulo 1234 / 10 = 4
    * whereas division gives us remaining numbers 1234 / 10 = 123
    * base condition n == 0 return 0
    * f(n)= sumdig(n/%10)
    * f(123) = s(123/10)+(123%10)
    *           = s(12) + 3
    *           = s(1)+2+3
    *           = s(0)+1+2+3
    *           = 0 + 1 + 2+ 3
    * */
    public static int digsum(int n){
        if(n==0)return 0;
        return digsum(n/10)+(n%10);
    }
}
