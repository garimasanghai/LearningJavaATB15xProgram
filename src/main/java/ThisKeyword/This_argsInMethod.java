package ThisKeyword;

// This is a ref variable which refers to current class obj
public class This_argsInMethod {

    void m1(This_argsInMethod am){ //Sending one obj to another obj
        System.out.println("This is m1 method");
    }
    void m2(){
        m1(this); //this keyword can be passed as an args in the method
    }

    public static void main(String[] args) {
        This_argsInMethod ta = new This_argsInMethod();
        ta.m2();
    }
}
