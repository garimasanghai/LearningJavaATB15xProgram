package SuperKeyword;


// In case of Method, Super keyword is used, In case of cons super() is used
public class Super_Calling_ParentClsCons {

    Super_Calling_ParentClsCons(){
        System.out.println("You're in Parent class");
    }
}
class B2 extends Super_Calling_ParentClsCons {

        B2(){
            super();  //whether u write super() here or not, it will automatically call Parent class cons
            System.out.println("You're in current class");
        }

    public static void main(String[] args) {
        B2 bb = new B2();
    }
}