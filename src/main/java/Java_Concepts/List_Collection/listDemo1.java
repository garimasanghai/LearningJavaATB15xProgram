package Java_Concepts.List_Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class listDemo1 {
    public static void main(String[] args) {
        List mylist = new ArrayList(); // Arrays Format - Continuous
        List mylist2 = new LinkedList(); // Doubly Linked List.
        // How they are stored in the memory


        List fruits = List.of("Orange","Apple");
        fruits.add("WaterMelon"); // java.lang.UnsupportedOperationException


    }
}
