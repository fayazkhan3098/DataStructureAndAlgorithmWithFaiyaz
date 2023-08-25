package DSA.Recursion;

public class MessagesBF {
    public static void main(String[] args) {
        // print hello world five times
        message();
    }

    private static void message() {
        System.out.println("Hello World!");
        message1();
    }
    private static void message1() {
        System.out.println("Hello World!");
        message2();
    }
    private static void message2() {
        System.out.println("Hello World!");
        message3();
    }
    private static void message3() {
        System.out.println("Hello World!");
        message4();
    }
    private static void message4() {
        System.out.println("Hello World!");
    }
    // this will output :
    // Hello World!
    //Hello World!
    //Hello World!
    //Hello World!
    //Hello World!
}
