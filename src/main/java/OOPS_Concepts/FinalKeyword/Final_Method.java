package OOPS_Concepts.FinalKeyword;

public class Final_Method {

    void show() {
        System.out.println("I am in Parent class");
    }

   final void display(){
        System.out.println("In Parent class, Method cannot be overriden as it is final");
    }
}
    class B3 extends Final_Method {
        void show(){
            System.out.println("I am in Child class");
        }
        /*
        void display(){
            System.out.println("As it is final, u cannot override it");
        }
        */

        public static void main(String[] args) {
            B3  b3 = new B3();
            b3.show();
            b3.display();
        }
    }
