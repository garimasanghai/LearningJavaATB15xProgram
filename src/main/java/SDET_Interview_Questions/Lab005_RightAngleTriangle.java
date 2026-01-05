package SDET_Interview_Questions;

public class Lab005_RightAngleTriangle {
    public static void main(String[] args) {
        int num = 5;

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("------");

        for(int a = 1; a <= num; a++){
            for(int b = num; b >= a; b--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        System.out.println("---Side Triangle---");
    }
}
