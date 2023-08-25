package DSA.Subset;

import java.util.ArrayList;
import java.util.Collections;

public class combinationsRecursive {
    static int count = 0;
    public static void main(String[] args) {

        System.out.println("\n"+count);
        System.out.println(SubSeqRet("","faiyaz"));
        System.out.println("\n"+count);
        SubSeq("","Faiyaz");
        System.out.println("\n"+count);
        SubSeqAscii("","faiyaz");
        System.out.println("\n"+count);
        System.out.println(SubSeqAsciiRet("","faiyaz"));
        System.out.println("\n"+count);
    }
    static void SubSeq(String Processed, String Unprocessed) {
        if(Unprocessed.isEmpty()) {
            System.out.print(" "+Processed);
            count++;
            return;
        }
        char ch = Unprocessed.charAt(0);

        SubSeq(Processed+ch,Unprocessed.substring(1));
        SubSeq(Processed,Unprocessed.substring(1));
    }
    static ArrayList<String> SubSeqRet(String Processed, String Unprocessed) {
        if(Unprocessed.isEmpty()) {
            count++;
            return new ArrayList<>(Collections.singleton(Processed));
        }
        char ch = Unprocessed.charAt(0);

        ArrayList<String> left = SubSeqRet(Processed+ch,Unprocessed.substring(1));
        ArrayList<String> right = SubSeqRet(Processed,Unprocessed.substring(1));
        left.addAll(right);
        return left;
    }
    static void SubSeqAscii(String Processed, String Unprocessed) {
        if(Unprocessed.isEmpty()) {
            System.out.print(" "+Processed);
            count++;
            return;
        }
        char ch = Unprocessed.charAt(0);

        SubSeqAscii(Processed+ch,Unprocessed.substring(1));
        SubSeqAscii(Processed,Unprocessed.substring(1));
        SubSeqAscii(Processed+(ch+0),Unprocessed.substring(1));
    }
    static ArrayList<String> SubSeqAsciiRet(String Processed, String Unprocessed) {
        if(Unprocessed.isEmpty()) {

            count++;
            return new ArrayList<>(Collections.singleton(Processed));
        }
        char ch = Unprocessed.charAt(0);

        ArrayList<String> first = SubSeqAsciiRet(Processed+ch,Unprocessed.substring(1));
        ArrayList<String> second = SubSeqAsciiRet(Processed,Unprocessed.substring(1));
        ArrayList<String> third = SubSeqAsciiRet(Processed+(ch+0),Unprocessed.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
