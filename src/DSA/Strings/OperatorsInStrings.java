package DSA.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class OperatorsInStrings {
    public static void main(String[] args) {
        System.out.println((int) 'a'+" "+(int)'b');//98 98
        // here you can see under single ' ' charters ascii value being type casted in int and printed
        System.out.println('a'+'b');//195
        // here directly ascii values are being summed
        System.out.println('a'-'b');//-1
        // here ascii values are being subtracted

        System.out.println("a" + "b");//ab
        // here we are concatenating a and b char
        // we can not type cast here in double quote String as it does not refer to ascii
        // even we can not subtract here

        System.out.println("a"+new ArrayList<>());//a[]
        // here we are concatenating char a and an object similarly
        System.out.println("a"+ Arrays.toString(new int[2]));//a[0, 0]
        // here you can see we need to override tostring method from arrays class
        // as only initialization will display its object heap address as shown below
        System.out.println("a"+new int[]{1, 2});//a[I@6acbcfc0

        //System.out.println(new ArrayList<>()+new Integer(56));//error
        // here you can see + operator can not be applied to two objects
        // we can achieve this by just putting one string in it
        String ans = new ArrayList<>()+""+new Integer(56);//[]56
        System.out.println(ans);

    }
}
