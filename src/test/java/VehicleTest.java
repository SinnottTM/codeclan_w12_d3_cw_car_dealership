import component.*;
import org.junit.Before;
import org.junit.Test;
import vehicle.Car;
import vehicle.Limousine;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class VehicleTest {

    Car car;
    Limousine limousine;

    Engine engine;
    Seat carSeats;
    Seat limoSeats;
    Door doors;
    Tyres tyres;

    @Before
    public void before(){
        
        engine = new Engine("Thomas the Tank", 1000000);
        carSeats = new Seat(4);
        limoSeats = new Seat(10);
        doors = new Door(4);
        tyres = new Tyres(4);
        
        car = new Car(engine, carSeats, doors, tyres, 25000.00, CarType.PETROL,"blue", Condition.NEW);
        limousine = new Limousine(engine, limoSeats, doors, tyres, 25000.00, "black", Condition.USED);
    }

    @Test
    public void limoHasEngine(){
        assertNotNull(limousine.getEngine());
    }
    
    @Test
    public void limoCanSetEngine(){
        Engine newEngine = new Engine("The Big Lad", 300);
        limousine.setEngine(newEngine);
        assertEquals(newEngine, limousine.getEngine());
    }

    @Test
    public void limoHas10Seats(){
        assertEquals(10, limousine.getSeats().getAmount());
    }

    @Test
    public void limoCanSetSeat(){
        limousine.setSeats(carSeats);
        assertEquals(carSeats, limousine.getSeats());
    }

    @Test
    public void limoHasDoors(){
        assertNotNull(limousine.getDoors());
    }

    @Test
    public void limoCanSetDoors(){
        Door newDoor = new Door(4);
        limousine.setDoors(newDoor);
        assertEquals(newDoor, limousine.getDoors());
    }

    @Test
    public void limoHasTires(){
        assertNotNull(limousine.getTyres());
    }

    @Test
    public void limoCanSetTires(){
        Tyres newTyres = new Tyres(30);
        limousine.setTyres(newTyres);
        assertEquals(newTyres, limousine.getTyres());
    }

    @Test
    public void carHasType(){
    assertEquals("PETROL", car.getCarType().toString());
    }

    @Test
    public void canDamageCar() {
        car.smashUpVehicle();
        assertEquals(Condition.VERYUSEDLIKEYOURMA, car.getCondition());
    }

    @Test
    public void canWreakCar() {
        car.wreckVehicle();
        assertEquals(Condition.BANJANXED, car.getCondition());
    }
    
}
