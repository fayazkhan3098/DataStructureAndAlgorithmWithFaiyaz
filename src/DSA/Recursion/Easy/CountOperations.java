package DSA.Recursion.Easy;

class CountOperations {
    public static void main(String[] args) {
        System.out.println(countOperations(2,3));
    }
    public static int countOperations(int num1, int num2) {

        return count(num1,num2,0);
    }
    public static int count(int n1,int n2,int c) {
        if(n1 == 0 || n2 == 0)return c;
        if(n1 >= n2) {
            return count(n1-n2,n2,c+1);
        }
        return count(n1,n2-n1,c+1);
    }

}