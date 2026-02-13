package Array_Basics;

public class Array_Duplicate {
    public static void main(String[] args) {
        int[] a = {2,3,5,7,9,2,8,7,9,5};
        System.out.println("Duplicate num: ");
        for(int i =0; i<a.length-1; i++){
            for(int j= i+1; j<a.length; j++){
                if(a[i]==a[j] && i!=j){
                    System.out.print(a[j] + " ");
                }
            }
        }
    }
}
