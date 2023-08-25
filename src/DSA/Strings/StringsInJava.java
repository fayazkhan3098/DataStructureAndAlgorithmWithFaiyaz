package DSA.Strings;

public class StringsInJava {
    /*
    * String is a predefined class in java which is used to store characters as string which are immutable
    * why immutable? -> as we know their two memories in java memory management which are Heap and stack which holds
    * primitive data type of reference variable and object values as Stringpool respectively
    * if we create any variable like String a = "faiyaz";
    * it creates stack as variable a and its object in heap String pool,
    * and variable a is pointing as reference to heap object
    * while we create second variable as String b = "faiyaz" ;
    * here stack will create reference variable in stack but will point or refer to the same object "faiyaz",
    * as if now if we make change in any of the reference variable a or b ,
    * both variables will be changed hence String is immutable
    *
    * */

    public static void main(String[] args) {
        String a = "faiyaz";
        String b = "faiyaz";
        String c = a;
        // Creating a new String object specifically asking jvm to do so
        // this will create a new object but outside of stringpool in heap
        String name = new String("faiyaz");

        // Comparison operators and functions
        // == is comparison operator
        // which checks whether a and b are referencing to the same object in the heap or not
        System.out.println(a == b); // True
        System.out.println(a == c); //true
        System.out.println(name == a); // false

        // so you might be having question then how to compare exact values of object?
        // so to do so we are having a method of String class itself which compares values of objects
        // and can be directly callled by any of its object
         String name2 = new String("khan");
        System.out.println(a.equals(b));// true
        System.out.println(name.equals(b)); // true
        System.out.println(name.equals(name2)); // false





    }
}
