package DSA.Recursion.Easy;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println(CZero(101010101, 0));
    }

    private static int CZero(int n, int c ) {
        if(n == 0)return c;
        if(n%10 == 0)return CZero(n/10,c+1);
        return CZero(n/10,c);
    }

}
