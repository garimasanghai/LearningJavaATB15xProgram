package Java_Concepts.List_Collection;

import java.util.Vector;

public class vectorDemo2 {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Pramod");
        v.add("Amit");
        v.add("Lucky");
        System.out.println(v);
        v.remove("Amit");
        System.out.println(v.contains("Lucky"));
        System.out.println(v);
    }
}
