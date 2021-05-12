package dealership;

import component.Condition;
import people.Customer;
import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double finances;
    private ArrayList<Vehicle> carTotal;

    public Dealership(String name, double finances, ArrayList<Vehicle> carStock){
        this.name = name;
        this.carTotal = carStock;
        this.finances = finances;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFinances() {
        return finances;
    }

    public void setFinances(double finances) {
        this.finances = finances;
    }

    public int getStockCount() {
        return this.carTotal.size();
    }


    public void buyCar(Vehicle car){
        this.carTotal.add(car);
        this.finances -= car.getPrice();
    }

    public void sellCar(Vehicle car, Customer customer) {
        this.carTotal.remove(car);
        this.finances += car.getPrice();
        customer.buyCar(car);
    }

    public void repairCar(Vehicle car) {
        this.finances += car.getCondition().getRepairCost();
        car.setCondition(Condition.USED);
    }

}
