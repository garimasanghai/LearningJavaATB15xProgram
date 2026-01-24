package Java_Basics_01;

// Convert int to String

public class Lab021_Conversion_Int_To_String {
    public static void main(String[] args) {
        int num = 12;
        String str = Integer.toString(num);
        System.out.println(str);

        //       OR

        int num1 = 15;
        String str1 = String.valueOf(num1);
        System.out.println(str1);

    }
}
