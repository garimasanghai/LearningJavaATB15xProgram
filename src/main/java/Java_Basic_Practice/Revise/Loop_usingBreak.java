package Java_Basic_Practice.Revise;

public class Loop_usingBreak {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            if( i == 5){
                break; //it breaks the loop & doesn't get executed further
            }
            System.out.println(i);
        }
    }
}
