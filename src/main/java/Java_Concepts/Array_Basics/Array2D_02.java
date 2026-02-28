package Java_Concepts.Array_Basics;

public class Array2D_02 {
    public static void main(String[] args) {
        int[][] a = {{4,5,6}, {7,8,9}};

        System.out.println("Value of a at index [0][0]: " + a[0][0]);
        System.out.println("Value of a: " + a + " <---giving hashcode num");
        System.out.println("Length of a: " + a.length + " <---total number of rows");
        System.out.println(a[0].length + " <---total number of columns");

        for(int i =0; i< a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

}
