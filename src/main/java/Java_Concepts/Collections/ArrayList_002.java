package Java_Concepts.Collections;

import java.util.ArrayList;

public class ArrayList_002 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(400);
        System.out.println(al);
        System.out.println(al.add("aaa")); //will check if element can be added to collection, returns boolean
        System.out.println(al.add(100));
        System.out.println(al); //can store duplicates

        System.out.println(al.contains(1000)); //will check if collection contains element, returns boolean
    }
}
