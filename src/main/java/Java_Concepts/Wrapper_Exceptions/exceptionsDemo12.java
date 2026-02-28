package Java_Concepts.Wrapper_Exceptions;

import java.util.Scanner;

public class exceptionsDemo12 {
    public static void main(String[] args) {
        Scanner sc = null;
        sc = new Scanner(System.in);
        int v = sc.nextInt();
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            sc.close();
            System.out.println("closing sc");

        }
    }
}
