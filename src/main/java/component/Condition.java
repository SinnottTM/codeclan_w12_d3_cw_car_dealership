package component;

public enum Condition {

    NEW (0),
    USED (250),
    VERYUSEDLIKEYOURMA (5000),
    BANJANXED (10000);

    private final int repairCost;

    Condition(int repairCost) {
        this.repairCost = repairCost;}

    public int getRepairCost() {
        return repairCost;
    }
}
