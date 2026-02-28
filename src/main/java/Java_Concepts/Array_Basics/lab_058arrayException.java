package Java_Concepts.Array_Basics;

public class lab_058arrayException {
    public static void main(String[] args) {
        // int [] marks = new int[-4];NegativeArraySizeException
        int [] marks = new int[4];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        marks[3] = 40;
        // System.out.println(marks[7]); ArrayIndexOutOfBoundsException
       // System.out.println(marks[-1]); ArrayIndexOutOfBoundsException
        System.out.println(marks[2]);
        // ArrayIndexOutOfBoundsException: Index -3 out of bounds for length 4

        int [] num = {40,30,20,10};
       // System.out.println(num[-1]); ArrayIndexOutOfBoundsException
        // System.out.println(num[5]); ArrayIndexOutOfBoundsException
        System.out.println(num[1]);

        int [] nums = new int[3];
        nums[-0] = 80;
        nums[1]= 90;
        System.out.println(nums[-0]); // VALID


    }
}
