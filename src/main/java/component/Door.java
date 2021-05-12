package component;

public class Door {

    private int amount;
    private boolean isLocked;

    public Door(int amount){
        this.amount = amount;
        this.isLocked = false;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public void unlock(){
        this.isLocked = false;
    }

    public void lock(){
        this.isLocked = true;
    }

}
