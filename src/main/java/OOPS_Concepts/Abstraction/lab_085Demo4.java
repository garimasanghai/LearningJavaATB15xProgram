package OOPS_Concepts.Abstraction;

public class lab_085Demo4 {
    public static void main(String[] args) {
        WagonR r  = new WagonR();
        r.drive();

        lab_089Tesla t  = new lab_089Tesla();
        t.drive();

        // Engine e = new Engine();
    }
}

class WagonR extends Engine{

    void drive(){
        startEngine();
        stopEngine();
    }


    @Override
    void startEngine() {
        System.out.println("starting car");
    }

    @Override
    void stopEngine() {
        System.out.println("stopping car");
    }
}
abstract class Engine {
    abstract void startEngine();
    abstract void stopEngine();
}
