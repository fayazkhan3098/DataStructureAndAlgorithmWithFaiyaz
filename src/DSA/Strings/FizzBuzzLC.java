package DSA.Strings;
// https://leetcode.com/problems/fizz-buzz/submissions/
import java.util.ArrayList;
import java.util.List;

class FizzBuzzLC {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));

    }
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>();
        int i = 1 ;
        while (i < n+1) {

            if((i)%3==0 && i%5==0){
                answer.add("FizzBuzz");
            }else if(i%3==0){
                answer.add("Fizz");
            }else if(i%5==0){
                answer.add( "Buzz");
            }else{
                answer.add( String.valueOf((i)));
            }
            i++;
        }
        return answer;
    }
}