package OOPS_Concepts.Abstraction;

public class lab_082superDemo1 {
    public static void main(String[] args) {
        Car c = new Car();

    }


}
//Creating a new car that inherits vehicle
class Car extends Vehicle{
    private int maxSpeed = 281;

    @Override
    void display() {
        System.out.println("Child");
    }
//This is new
    Car(){
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();
    }

}



class Vehicle{
    public int maxSpeed = 180;

    void display(){
        System.out.println("Parent");
    }


    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }
}
