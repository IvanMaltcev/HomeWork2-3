public class ServiceStation {

    public void check(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.service();
        }
    }
}

