package OOPS_Concepts.Inheritance;

public class lab_067createCar {
    public static void main(String[] args) {

        CarDemo tesla = new CarDemo();
        System.out.println("Details of the Car: ");
        System.out.println("Name: " + tesla.name);
        System.out.println("Colour: " + tesla.color);
        System.out.println("Created in: " + tesla.year);
        System.out.println();

        CarDemo cd = new CarDemo();
        cd.color = "Black";
        cd.name = "Kia";
        cd.year = 2023;
        System.out.println("Details of the Car: ");
        System.out.println("Name: " + cd.name);
        System.out.println("Color: " + cd.color);
        System.out.println("Created in: " + cd.year);
        cd.gear(4);
        cd.speed(70);
        cd.breaks();
        cd.windowRoll(false);
        System.out.println();

        CarDemo cd2 = new CarDemo();
        cd2.name = "Skoda";
        cd2.color = "Pearl Black";
        cd2.year = 2024;
        System.out.println("Details of the Car:");
        System.out.println("Name: " + cd2.name);
        System.out.println("Color: " + cd2.color);
        System.out.println("Created in: " + cd2.year);
        cd2.gear(5);
        cd2.speed(80);
        cd2.breaks();
        cd2.windowRoll(true);

    }
}
