package DSA.Recursion;

public class Numbers {
    public static void main(String[] args) {
        // print numbers from 1 to n
        numbers1();
    }

    public static void numbers1() {
        System.out.println(1);
        numbers2();
    }
    public static void numbers2() {
        System.out.println(2);
        numbers3();
    }
    public static void numbers3() {
        System.out.println(3);
        numbers4();
    }
    public static void numbers4() {
        System.out.println(4);
        numbers5();
    }
    public static void numbers5() {
        System.out.println(5);
    }
    // its output will be :
    //1
    //2
    //3
    //4
    //5
}
