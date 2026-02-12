package Array_Basics;

public class Array_001 {
    public static void main(String[] args) {
        int[] a = {2,7,8,9,3,4};

        int max = a[0];
        for(int i =1; i<a.length; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
