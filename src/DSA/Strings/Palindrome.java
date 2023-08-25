package DSA.Strings;

public class Palindrome {
    public static void main(String[] args) {
        String[] str = {"",null, "abcdcba","abccba","abgdh"};
        for (String ele:str ) {
            System.out.println(isPalindrome(ele));
        }
    }
    static boolean isPalindrome(String str){

        if(str == null || str.length() == 0 )
            return true;
        int strength = str.length();
        for (int i = 0; i < strength/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(strength - 1 - i);
            if(start != end)
                return false;
        }
        return true;
    }
}
