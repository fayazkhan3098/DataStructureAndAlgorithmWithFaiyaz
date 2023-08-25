package Streams_in_java;
/*
* collection: when want to represent a group of object as a single entity we go for collection
* stream: if we want to process objects from the collection we go for stream
* count : to count no of objects which are passing the condition
* */
 import java.util.*;
 import java.util.stream.*;
public class stream_filter {
    public static void main(String[] args) {
        ArrayList<Integer> Marks = new ArrayList<>();
        Marks.add(10);
        Marks.add(25);
        Marks.add(33);
        Marks.add(22);
        Marks.add(52);
        Marks.add(20);
        System.out.println("Marks: "+Marks);
        List<Integer> l2 = Marks.stream().filter(x-> x%2!=0).toList();
        System.out.println("odd numbers : "+l2);
        long failedStudents = Marks.stream().filter(x-> x<30).count();
        System.out.println("failed students are : "+failedStudents);
        List<Integer> sortedMarks = Marks.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted list : "+sortedMarks);

    }
}
