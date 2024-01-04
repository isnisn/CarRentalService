package RentalService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.random.*;

public class Fleet {
  private List<Car> car;
  private List<String> car_models;

  public Fleet() {
    this.car = new ArrayList<>();
  }

  public void addCar(Car car) {
    this.car.add(car);
  } 

  private void constructRandomFleet() {
    Random rnd = new Random();
    int min = 100;
    int max = 999;
  
  }

  public void printFleet() {
    for (Car car : this.car) {
      System.out.printf("Car is %s with color %s and regno %s \n",car.getModel(), car.getColor(), car.getregNo());
    }
  }

}
