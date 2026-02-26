package ThisKeyword;

public class This_inConstructor {
    class Test{
        Test(This_inConstructor am){
            System.out.println("This is Test class constructor");
        }
    }
    void m1(){ //Sending one obj to another obj
        //Creating an obj of Test class
        Test t1= new Test(this); // This keyword can be passed as an args in cons call
    }

    public static void main(String[] args) {
        This_inConstructor tc= new This_inConstructor();
        tc.m1();
    }
}
