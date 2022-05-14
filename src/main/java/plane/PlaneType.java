package plane;

public enum PlaneType {
    BOEING747(4, 125.00),
    AIRBUS(5,150.00);

    //capacity = passenger capacity
    private final int capacity;
    private double totalWeight;

    PlaneType(int capacity, double totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    //GETTERS
    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
