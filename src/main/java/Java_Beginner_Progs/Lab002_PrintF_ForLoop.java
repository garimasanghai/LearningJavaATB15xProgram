package Java_Beginner_Progs;

public class Lab002_PrintF_ForLoop {
    public static void main(String[] args) {
        int num =9;

        for(int i = 1; i<=10; i++){
            System.out.printf("%d * %d = %d", num,i,num*i);
            System.out.println();
        }
    }
}
