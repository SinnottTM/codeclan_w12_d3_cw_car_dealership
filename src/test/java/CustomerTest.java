import component.*;
import dealership.Dealership;
import org.junit.Before;
import people.Customer;
import vehicle.Car;
import vehicle.Vehicle;

import java.util.ArrayList;

public class CustomerTest {

    Dealership dealership;
    Customer customer;
    Car car1;
    Car car2;

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
}
