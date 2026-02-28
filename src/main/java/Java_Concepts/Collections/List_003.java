package Java_Concepts.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List_003 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(200);
        l.add(null);
        l.add("300 Deepak Sir");
        l.add(100);
        l.add(null);
        l.add("400 abc");
        System.out.println(l);

        Iterator itr = l.iterator(); // will iterate & return elements one after the other
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
