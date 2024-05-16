public class Truck extends MotorTransport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        super.checkEngine();
        System.out.println("Проверяем прицеп");
    }
}
