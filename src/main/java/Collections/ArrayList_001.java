package Collections;

import java.util.ArrayList;

public class ArrayList_001 {
    public static void main(String[] args) {
        ArrayList al = new ArrayList<>();
        al.add(100);
        al.add(200);
        al.add(400);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add("abc");
        al2.add("def");
        al2.add("ghi");
        System.out.println(al2);
        al.addAll(al2);

        System.out.println(al);

    }
}
