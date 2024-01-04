package RentalService;
import java.util.Scanner;

public class Main {

  private static Scanner userInput = new Scanner(System.in);
  private static Fleet fleet = new Fleet();

  public static void main(String[] args) {

    Boolean exit = false;
    int choice = 0;

   
    // Print menu
    menu(); 
    
    while(!exit) {
      choice = input();

      switch(choice) {
        
        // Add car to fleet
        case 1:
        addCarToFleet();
        
        break;

        case -1:
        System.out.println("Bye!");
        break;
      }
    }
  }  


  /*
   * Display the menu-options for the user.
   */
  public static void menu() {

    System.out.printf("---------------------------------- \n");
    System.out.printf("# LNU Rent-a-car \n");
    System.out.printf("---------------------------------- \n");
    System.out.printf("1. Add car to fleet \n");
    System.out.printf("2. Rent a car \n");
    System.out.printf("3. Return a car \n");
    System.out.printf("4. Print car fleet \n");
    System.out.printf("5. Print rental summary(Not implemented) \n");
    System.out.printf("q. End program \n");
    System.out.printf("> Enter your option: ");
  }


  /*
   * Add a car to the fleet.
   */
  public static void addCarToFleet() {

    String regNo = "";
    String carDetails = "";

    while (true) {

      System.out.printf("Enter registration number: \n");
      regNo = userInput.nextLine();

      // Check if the regNo is in valid format.
      if (!validateRegNo(regNo)) {
        System.out.printf("Invalid registration number! \n");
        continue;
      }

      // Check if the car is already in the fleet.
      if (fleet.carExist(regNo)) {
        break;
      }

      System.out.printf("Enter make and model: ");
      carDetails = userInput.nextLine();

      break;
    }
     Car car = new Car(regNo, "None", carDetails);
    // All good, add the car
    fleet.addCar(car);    
    System.out.printf("%s with registration number %s was added to the car fleet", carDetails, regNo);
  }

  private static boolean validateRegNo(String regNo) {
    return regNo.matches("[a-zA-Z]{3}[0-9]{2}[a-zA-Z]{1}") || regNo.matches("[a-zA-Z]{3}[0-9]{3}");
  }

  public static int input() {

    int output = 0;
    String input = "";

    // Check if input has an int value
    if (userInput.hasNextInt()) {
      output = userInput.nextInt();
      userInput.nextLine(); // Consume \n
      
      // Remove negative signs.
      output = output < 0 ? Math.abs(output) : output;
      return output;

    } else {
      input = userInput.nextLine();
      if (input.matches("[qQ]")) {
        return -1;
      } else {

        // Return -2 if input is not an integer or qQ
        return -2;
      }
    }
  }
}

