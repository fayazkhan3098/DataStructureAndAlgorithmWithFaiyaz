package DSA.Strings;
// https://leetcode.com/problems/shuffle-string/solutions/3765660/easy-solution-0ms-runtime-in-java-c/
import java.util.Arrays;

class ShuffleIndex {
    public static void main(String[] args) {
        int[] arr =new int[]{4,5,6,0,1,3,2};
        System.out.println(restoreString1("faiyazk",arr));

    }
    //wrong attemp
    public static String restoreString(String s, int[] indices) {
        String indicesS = Arrays.toString(Arrays.toString(indices).toCharArray());
        StringBuilder neww = new StringBuilder();
        for(int i= 0; i < indices.length;i++){
            neww.append(indices[i]);
        }

        String indices1 = neww.toString();
        StringBuilder ans = new StringBuilder(s.length());
        for(int i = 0; i < s.length() ; i++){
            int index = neww.indexOf(String.valueOf(i));
            ans.insert(index,s.charAt(index));
            System.out.print(index);
        }
        return ans.toString();
    }
    public static String restoreString1(String s, int[] indeces){
        char[] ans = new char[indeces.length];
        for (int i = 0; i < s.length(); i++) {
            ans[indeces[i]]=s.charAt(i);
        }
        return new String(ans);
    }
}