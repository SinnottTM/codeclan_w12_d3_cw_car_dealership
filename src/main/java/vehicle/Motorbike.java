package vehicle;

import component.*;

public class Motorbike extends Vehicle {
    public Motorbike(Engine engine, Seat seats, Door doors, Tyres tyres, double price, String colour, Condition condition) {
        super(engine, seats, doors, tyres, price, colour, condition);
    }

}
