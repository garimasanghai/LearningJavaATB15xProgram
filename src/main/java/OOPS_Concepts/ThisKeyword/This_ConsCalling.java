package OOPS_Concepts.ThisKeyword;

public class This_ConsCalling {

    This_ConsCalling(){
        this(88);
        System.out.println("Calling zero parameterised constructor");
    }

    This_ConsCalling(int a){
        // this(); //calling current class constructor
        System.out.println("Calling parameterised constructor");
    }

    public static void main(String[] args) {
        This_ConsCalling tc = new This_ConsCalling();
       // This_ConsCalling tc1 = new This_ConsCalling(86);
    }
}
