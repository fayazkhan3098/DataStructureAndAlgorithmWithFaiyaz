
public class Main {
    public static void main(String[] args) {
        int num = 5; // Binary: 100101
        int count = 0;

        while (num > 0) {
            num &= (num - 1); // Turn off the rightmost 1-bit
            count++;
        }

        System.out.println("Number of 1s: " + count); // Output: 3

    }
}
