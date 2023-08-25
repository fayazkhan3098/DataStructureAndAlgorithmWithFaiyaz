package DSA.Recursion.Easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(5));
        System.out.println(isPowOfTwo(4));
        System.out.println(isPowOfTwo(5));
    }
    public static boolean isPowerOfTwo(int n) {
        // non-recursive Solution using bitwise operators
        return (n>0) && ((n & (n-1))==0);
        /*The expression `n > 0 && !(n & (n - 1))` is used to check if a given positive integer `n` is a power of 2.

Let's break down the expression step by step:

1. `n > 0`: This checks if `n` is a positive integer. It ensures that `n` is greater than zero.

2. `n & (n - 1)`: This is a bitwise operation that effectively removes the least significant bit (LSB) of `n`. If `n` is a power of 2, it will have only one bit set to 1, and removing the LSB will result in a value of 0. For example:

   - Binary representation of 8: 1000
   - Binary representation of 7: 0111
   - 8 & 7 = 0000 (which is 0)

3. `!(n & (n - 1))`: The `!` operator negates the result of the previous bitwise operation. If the result is 0 (i.e., `n` is a power of 2), then `!(n & (n - 1))` will be true.

So, when `n` is both a positive integer (`n > 0`) and its bitwise AND operation with `(n - 1)` results in 0 (`!(n & (n - 1))` is true), it means that `n` is a power of 2.

For example:
- 4 is a power of 2 (binary: 100)
- 16 is a power of 2 (binary: 10000)
- 8 is a power of 2 (binary: 1000)

However, if `n` is not a power of 2, then `n & (n - 1)` will have at least one non-zero bit, and `!(n & (n - 1))` will be false.*/ // explanation how does it work
    }
    public static boolean isPowOfTwo(int n) {
        if(n <= 0)return false;
        if (n == 1)return true;
        return n % 2 == 0 && isPowOfTwo(n/2);
    }
}
