package DSA.Strings;

public class SortingTheSentence {
    public static void main(String[] args) {

        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        StringBuilder answer = new StringBuilder();
        for(int i = 1 ; i < 10 ; i++){
            int lastindexofsubarray=s.indexOf(String.valueOf(i));
            if(lastindexofsubarray == -1)break;
            int firstIndexofsubarray = (s.lastIndexOf(" ",lastindexofsubarray)==-1)?0:s.lastIndexOf(" ",lastindexofsubarray);
            if(firstIndexofsubarray==0)answer.append(" ");
            answer.append(s,firstIndexofsubarray,lastindexofsubarray);
        }
        answer.deleteCharAt(0);
        return answer.toString();
    }
}
