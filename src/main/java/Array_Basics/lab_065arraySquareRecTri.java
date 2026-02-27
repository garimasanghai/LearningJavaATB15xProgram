package Array_Basics;

public class lab_065arraySquareRecTri {
    public static void main(String[] args) {
        System.out.println("It's a Rectangle");
        String [][] matrix = {{"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}, {"*","*","*","*"}};
        for(int i = 0; i<matrix.length; i++){// will give u rows
            for(int j = 0; j< matrix[i].length; j++){// will give u column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("It's a Square");
        String [][] matrix4 = {{"*","*","*","*","*"}, {"*","*","*","*","*"}, {"*","*","*","*","*"}, {"*","*","*","*","*"}};
        for(int i = 0; i<matrix4.length; i++) {// will give u rows
            for (int j = 0; j < matrix4[i].length; j++) {// will give u column
                System.out.print(matrix4[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("It's a Right Angled Triangle");
        String [][] matrix2 = {{"*"}, {"*","*"}, {"*","*","*"}, {"*","*","*","*"}, {"*","*","*","*","*"}};
        for(int i = 0; i<matrix2.length; i++){// will give u rows
            for(int j = 1; j< matrix2[i].length; j++){// will give u column
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("It's a Left Angled Triangle");
        String [][] matrix3 = {{"*","*","*","*","*"}, {"*","*","*","*"}, {"*","*","*"}, {"*","*"}, {"*"}};
        for(int i = 0; i<matrix3.length; i++) {// will give u rows
            for (int j = 0; j < matrix3[i].length; j++) {// will give u column
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
