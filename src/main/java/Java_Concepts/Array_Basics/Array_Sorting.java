package Java_Concepts.Array_Basics;

import java.util.Arrays;

public class Array_Sorting {
    public static void main(String[] args) {
        int[] a = {5,7,9,3,2,8};

        Arrays.sort(a); // <--- M A N D A T O R Y method
        System.out.println("Ascending order --->");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i] + " ");
        }
        System.out.println("Descending order --->");
        for(int i=a.length-1; i>=0; i--){
            System.out.println(a[i] + " ");
        }
    }
}
