package SDET_Interview_Questions;

public class lab010_Pyramid {
    public static void main(String[] args) {
        int num = 7;
        for(int i =1; i<=num; i++){
            for(int j= num; j>=i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
