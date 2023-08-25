package DSA.Recursion.Easy;

class Steps2ReduceN2Zero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {
        return numberOfStep(num,0);
    }
    public static  int numberOfStep(int n, int c) {
        if(n == 0)return c;
        if(n%2!=0)return numberOfStep(n-1,c+1);
        return numberOfStep(n/2,c+1);
    }
}