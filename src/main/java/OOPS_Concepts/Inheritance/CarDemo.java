package OOPS_Concepts.Inheritance;

public class CarDemo {

    // A -> Attributes | data members | instance variables | fields | member variables
    String name;
    String color;
    int year;

    //  B -> Behaviour | methods | member functions

    CarDemo() {
        System.out.println("CarDemo default constructor is executing!");
        name = "Unknown Name";
        color = "XYZ";
        year = 0;
    }

    void breaks() {

        System.out.println("Break: Suggestive & Automatic");
    }

    void gear(int g) {

        System.out.println("Gear: Automatic");
    }

    boolean windowRoll(boolean t) {
        System.out.println("Window Roll function: Press up/down");
        return t;
    }

    int speed(int s) {
        System.out.println("Speed: Suggested & Warning");
        return 50;
    }
}

