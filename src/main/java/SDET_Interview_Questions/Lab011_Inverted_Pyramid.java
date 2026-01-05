package SDET_Interview_Questions;

public class Lab011_Inverted_Pyramid {
    public static void main(String[] args) {

        int num = 7;
        for (int i = 1; i <= num; i++) {
            for(int j =1; j<=i; j++) {
                System.out.print(" ");
            }
            for(int k = num; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
