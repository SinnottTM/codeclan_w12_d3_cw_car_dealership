import component.*;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import people.Customer;
import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car1;
    Car car2;
    Customer customer;

    Engine engine;
    Seat carSeats;
    Seat limoSeats;
    Door doors;
    Tyres tyres;

    ArrayList<Vehicle> dealershipCars;
    ArrayList<Vehicle> customerCars;


    @Before
    public void before() {

        engine = new Engine("Thomas the Tank", 1000000);
        carSeats = new Seat(4);
        limoSeats = new Seat(10);
        doors = new Door(4);
        tyres = new Tyres(4);
        car1 = new Car(engine, carSeats, doors, tyres, 25000.00, CarType.PETROL, "blue", Condition.NEW);
        car2 = new Car(engine, carSeats, doors, tyres, 25000.00, CarType.PETROL, "blue", Condition.NEW);

        dealershipCars = new ArrayList<>();
        customerCars = new ArrayList<>();

        customer = new Customer("Zsolt", 1000000);

        dealership = new Dealership("Honest Bob", 100000, dealershipCars);
    }

    @Test
    public void dealershipCanBuyCar() {
        dealership.buyCar(car1);
        assertEquals(1, dealership.getStockCount());
        assertEquals(75000.00, dealership.getFinances(), 0.01);

    }

    @Test
    public void dealershipCanSellCar(){
        dealership.buyCar(car1);
        dealership.buyCar(car2);
        assertEquals(2, dealership.getStockCount());
        dealership.sellCar(car1, customer);
        assertEquals(1, dealership.getStockCount());
        assertEquals(75000.00, dealership.getFinances(), 0.01);
        assertEquals(1, customer.getCarCount());
        assertEquals(975000,customer.getBudget(), 0.01);
    }

    @Test
    public void dealershipCanRepairCar(){
        car1.wreckVehicle();
        dealership.repairCar(car1);
        assertEquals(110000, dealership.getFinances(), 0.01);
    }
}
