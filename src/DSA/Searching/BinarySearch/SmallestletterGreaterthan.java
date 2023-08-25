package DSA1.searching.BinarySearch;

public class SmallestletterGreaterthan {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};
        char target = 'f';
        System.out.println(nextGreatestLetter(letters, target));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while (start <= end) {
            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid - 1;
            }else{
                start = mid +1;
            }

        }

        return letters[start % letters.length];
    }
}
