package DSA.Strings;
// https://leetcode.com/problems/first-unique-character-in-a-string/description/
class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        System.out.println(firstUniqueChar("faiyaz Khan"));
    }
    public static int firstUniqueChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(int c = 'a' ; c <= 'z' ; c++){
            int index = s.indexOf(c);
               if(index != -1 && index ==s.lastIndexOf(c)){
                   ans = Math.min(ans,index);
               }           
        }
    return ans == Integer.MAX_VALUE?-1:ans;
    }
}