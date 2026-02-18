package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_003 {
    public static void main(String[] args) {
        Set s = new HashSet();
        s.add(100);
        s.add("200 Deepak Sir");
        s.add("300 abc");
        s.add(null);
        s.add(2);
        System.out.println(s); //Duplicates not allowed. Does not follow insertion order


    }
}
