package people;

import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {

    private String name;
    private double budget;
    private final ArrayList<Vehicle> carCollection;

    public Customer(String name, double budget){
        this.name = name;
        this.budget = budget;
        this.carCollection = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public int getCarCount() {
        return this.carCollection.size();
    }

    public void buyCar(Vehicle car) {
        this.carCollection.add(car);
        this.budget -= car.getPrice();
    }

//    public void removeCarFromCollection(Vehicle car){
//        this.carCollection.remove(car);
//        this.budget += car.getPrice();
//    }

}
