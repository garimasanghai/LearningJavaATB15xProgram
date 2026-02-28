package Java_Concepts.Array_Basics;

public class Array_SecondLargest {
    public static void main(String[] args) {
        int[] a= {5,6,8,9,2,3};

        int temp;
        for(int i = 0; i< a.length; i++){
            for(int j = i+1; j<a.length; j++){
                if(a[i]< a[j]){
                    temp = a[i];
                    a[i]= a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest num: " + a[1]);
        System.out.println("Third largest num: " + a[2]);
        System.out.println("Largest num: " + a[0]);
    }
}
