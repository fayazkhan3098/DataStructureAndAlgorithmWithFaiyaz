package DSA1.searching.LinearSearch;

public class StringSearch {
    public static void main(String[] args) {
        String name = "faiyaz khan";
        char target = 'i';
        System.out.println(LinearSearch(name, target));
        System.out.println(LinearSearch2(name, target));
    }
    // String search using simple for loop
    static boolean LinearSearch(String str, char target){
        if(str.length() < 0){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
    // String search using simple for-each loop
    static boolean LinearSearch2(String str, char target){
        if(str.length() < 0){
            return false;
        }
        for (char element : str.toCharArray()) {
            if (target == element) {
                return true;
            }
        }
        return false;
    }
}
