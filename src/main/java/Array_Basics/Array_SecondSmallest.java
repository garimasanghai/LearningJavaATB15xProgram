package Array_Basics;

public class Array_SecondSmallest {
    public static void main(String[] args) {
        int[] a = {7,8,5,9,3,2};
        int temp;

        for(int i = 0; i<a.length; i++){
            for(int j =i+1; j<a.length; j++){
                if(a[i]>a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0; i<a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Second smallest num: " + a[1]);
    }
}
