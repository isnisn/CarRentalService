package RentalService;

/**
 *  I think this is an Encapsulated class.
 */
public class Car {
  
  private String regNo;
  private String color;
  private String model;

  public Car(String regNo, String color, String model) {
    this.regNo = regNo;
    this.color = color;
    this.model = model;
  }

  public void setRegNo(String regNo) {
    this.regNo = regNo;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getregNo() {
    return this.regNo;
  }

  public String getColor() {
    return this.color;
  }

  public String getModel() {
    return this.model;
  }

  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return super.toString();
  }
}
