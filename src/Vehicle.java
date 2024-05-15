public abstract class Vehicle {

    private final String modelName;
    private final int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    void checkEngine() {
    }

    void checkTrailer() {
    }
}
