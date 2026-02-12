package StaticKeyword;

public class Demo2 {
    int i = 10;
    static int k = 101;

    static void display(){
      //  System.out.println(i); // Error, coz static methods will never have access to static data
      //  System.out.println(this.k); //this cannot be used in static 
        System.out.println(k + " Static method"); // static methods will access only static data
    }

    void show(){
        System.out.println(i + " Normal method");
    }

    public static void main(String[] args) {

    }
}
