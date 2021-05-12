package vehicle;

import component.*;

public abstract class Vehicle {

    private Engine engine;
    private Seat seats;
    private Door doors;
    private Tyres tyres;
    private Double price;
    private String colour;
    private Condition condition;

    public Vehicle(Engine engine, Seat seats, Door doors, Tyres tyres, double price, String colour, Condition condition) {
        this.engine = engine;
        this.seats = seats;
        this.doors = doors;
        this.tyres = tyres;
        this.price = price;
        this.colour = colour;
        this.condition = condition;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Seat getSeats() {
        return seats;
    }

    public void setSeats(Seat seats) {
        this.seats = seats;
    }

    public Door getDoors() {
        return doors;
    }

    public void setDoors(Door doors) {
        this.doors = doors;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Condition getCondition() {
        return condition;
    }
    public void setCondition(Condition condition) {
        this.condition = condition;
    }
    public void smashUpVehicle(){
        this.condition = Condition.VERYUSEDLIKEYOURMA;
        this.price -= condition.getRepairCost();
    }

    public void wreckVehicle(){
        this.condition = Condition.BANJANXED;
        this.price -= condition.getRepairCost();
    }
}
