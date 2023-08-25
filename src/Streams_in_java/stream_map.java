package Streams_in_java;
/*
* map: if we want to apply some operation on every object of collection list then go for map
* */
import java.util.*;
import java.util.stream.*;
public class stream_map {
    public static void main(String[] args) {
        ArrayList<Integer> Marks = new ArrayList<>();
        Marks.add(11);
        Marks.add(22);
        Marks.add(33);
        Marks.add(44);
        Marks.add(55);
        Marks.add(66);
        System.out.println("Marks :"+Marks);
        ArrayList<Integer> UpdatedMarks= (ArrayList<Integer>) Marks.stream().map(x-> x+5).collect(Collectors.toList());
        System.out.println("Updated Marks: "+UpdatedMarks);
    }
}
