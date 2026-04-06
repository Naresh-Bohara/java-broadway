package inheritancetypes.hierarchical;

public class Main {
	public static void main(String[] args) {
		Car c = new Car();
        c.start();   // from Vehicle
        c.drive();   // from Car
        
        System.out.println("----------------------");
        
        Bike b = new Bike();
        b.start();   // from Vehicle
        b.ride();    // from Bike
	}
}
