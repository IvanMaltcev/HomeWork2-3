public class Car extends MotorTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void service() {
        super.service();
        super.checkEngine();
        System.out.println("Проверяем двигатель");
    }
}
