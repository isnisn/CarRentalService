package RentalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.*;

public class Fleet {
  private List<Car> cars;
  private List<String> car_models;

  public Fleet() {
    this.cars = new ArrayList<>();
  }

  public void addCar(Car car) {
    if (car != null) {
      this.cars.add(car);
    } else {
      // ...
    }
  } 

  private void constructRandomFleet() {
    Random rnd = new Random();
    int min = 100;
    int max = 999;
  
  }

  public void printFleet() {
    for (Car car : this.cars) {
      System.out.printf("Car is %s with color %s and regno %s \n",car.getModel(), car.getColor(), car.getregNo());
    }
  }

  public Boolean carExist(String regNo) {
    for (Car car : this.cars) {
      if (car.getregNo() == regNo) {
        return true;
      } 
    } 
    return false;
  }

}
