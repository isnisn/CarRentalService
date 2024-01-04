package RentalService;

public class App {
  public static void main(String[] args) {
  Fleet fleet = new Fleet();
  
  // Add a car
  Car c = new Car("GED428", "Green", "Audi");
  
  fleet.addCar(c);
  fleet.printFleet();
  
  // System.out.println(c.toString());
  
  }  
}

