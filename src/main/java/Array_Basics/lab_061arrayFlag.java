package Array_Basics;

public class lab_061arrayFlag {
    public static void main(String[] args) {
        String [][] matrix = {{"*","*","*","*","*"}, {"*","*","*","*","*"}, {"*","*","*","*","*"}};
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j< matrix[i].length; j++){// will give u column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        String [][] matrix2 = {{"*"},{"*"},{"*"}};
        for(int i = 0; i<matrix2.length; i++){
            for(int j = 0; j<matrix2[i].length; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
