package DSA.Strings;

public class StringsPerformanceNYStringBuilder {
    public static void main(String[] args) {
        // consider a program
        String a = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            a = a + ch ;
        }
        System.out.println("String: "+a);
        // here we know String are immutable and in this program with each
        // Iteration a new String Object will be created
        // this will increase programs space complexity to O(N^2)
        // to overcome this problem java have StringBuilder which is mutable in nature
        // and make changes to its own object of string
        // StringBuilder is a separate class  lets take a deep look over it in Stringbuilder section
        StringBuilder ab =new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            ab.append(ch) ;
        }
        System.out.println("StringBuilder: "+ab);
    }
}
