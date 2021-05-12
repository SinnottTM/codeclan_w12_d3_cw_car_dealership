package vehicle;

import component.*;

public class Car extends Vehicle{

    private CarType carType;

    public Car(Engine engine, Seat seats, Door doors, Tyres tyres, double price, CarType carType, String colour, Condition condition){
        super(engine, seats, doors, tyres, price, colour, condition);
        this.carType = carType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

}
