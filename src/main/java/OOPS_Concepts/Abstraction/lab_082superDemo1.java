package OOPS_Concepts.Abstraction;

class Vehicle {
    public int maxSpeed = 180;

    void display() {
        System.out.println("Parent");
    }

    Vehicle() {
        System.out.println("DC Vehicle");
    }

    Vehicle(int a) {
        System.out.println("PC Vehicle");
    }

    void message() {
        System.out.println("Hello Vehicle");
    }

    void message(int a) {
        System.out.println("Hello Vehicle");
    }
}

//Creating a new car that inherits vehicle
class Car extends Vehicle {
    private int maxSpeed;

    void setSpeed(int speed) {
        maxSpeed = speed;
    }

    public int getSpeed() {
        return maxSpeed;
    }

    @Override
    void display() {
        System.out.println("Child");
    }

    //This is new
    Car() {                              //Constructor
        super(10);
        System.out.println("DC Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
        this.display();
        super.display();
    }
}

public class lab_082superDemo1 {
    public static void main(String[] args) {
        Car c = new Car();
    }
}