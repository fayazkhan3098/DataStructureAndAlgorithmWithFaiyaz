package DSA.Recursion.Easy;

public class Concept {
    public static void main(String[] args) {
        concept(5);
    }
    public static void concept(int n){
        if (n == 0) {
            return;
        }
        System.out.println(n);
        //concept(n--); this will be a wrong call as first n will be called
        // then decrement will be applied
        concept(--n);
    }
}
