package OOPS_Concepts.FinalKeyword;

public class Final_Variable {

    public static void main(String[] args) {
        int i = 10;
        i = i +20;
        System.out.println(i);

       final int j = 80;
      // j = j +8;  <---- this line will throw error as j is made final & it cannot re instantiated
        System.out.println(j);
    }
}
