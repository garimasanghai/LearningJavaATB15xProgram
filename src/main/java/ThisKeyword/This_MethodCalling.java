package ThisKeyword;

public class This_MethodCalling {

    int i;

    void show(){
        System.out.println("Hi, u r calling show method");
    }
    void display(){
        show();
        System.out.println("Hi, now display method is getting exe");
    }

    public static void main(String[] args) {
        This_MethodCalling tk = new This_MethodCalling();
        tk.display();
    }
}
