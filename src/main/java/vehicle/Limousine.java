package vehicle;

import component.*;

public class Limousine extends Vehicle {

    public Limousine(Engine engine, Seat seats, Door doors, Tyres tyres, double price, String colour, Condition condition) {
        super(engine, seats, doors, tyres, price, colour, condition);
    }
}

