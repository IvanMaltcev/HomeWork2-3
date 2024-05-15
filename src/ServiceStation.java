public class ServiceStation implements StationService {

    public void check(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            System.out.println("Обслуживаем " + vehicle.getModelName());
            for (int i = 0; i < vehicle.getWheelsCount(); i++) {
                vehicle.updateTyre();
            }
            vehicle.checkEngine();
            vehicle.checkTrailer();
        }
    }
}

