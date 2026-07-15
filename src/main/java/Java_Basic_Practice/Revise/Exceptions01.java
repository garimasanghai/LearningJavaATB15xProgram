package Java_Basic_Practice.Revise;

public class Exceptions01 {
    public static void main(String[] args) {
        int num = 10;
        int num2 = 0;

        try{
            int c = num/num2;
        } catch (Exception e) {
            System.out.println(e.getMessage());;
        }

    }
}
