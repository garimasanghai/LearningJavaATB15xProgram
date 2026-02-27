package OOPS_Concepts.Inheritance;


public class CarDemo1 {

    String color;
    int price;

    CarDemo1 (){
        System.out.println("No args constructor");
    }
    CarDemo1(String color, int price) {
        System.out.println("Parameterised constructor");
        this.color = color;
        this.price = price;
    }

    String gear(int g) {
        return "Manual";
    }
}

class Kia extends CarDemo1 {
    int cc;
    boolean auto;

    Kia (){
       // super("black", 200000);
        System.out.println("No args constructor");
        this.cc = cc;
        this.auto= auto;
    }

    String gear(int g){
        return "Automatic";
    }

    public static void main(String[] args) {
        Kia k1 = new Kia();
        System.out.println("Kia's gear: " + k1.gear(7));
        CarDemo1 cd = new CarDemo1("black", 200000);
        System.out.println("Car's color: " + cd.color + " Car's price: " + cd.price);

    }
}
