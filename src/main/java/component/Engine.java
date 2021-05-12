package component;

public class Engine {

    private String model;
    private int horsePower;

    public Engine(String model, int horsePower){
        this.model = model;
        this.horsePower=horsePower;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
