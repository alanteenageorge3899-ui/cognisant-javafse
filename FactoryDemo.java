public class FactoryDemo {

    public static void main(String[] args) {

        Vehicle vehicle1 = VehicleFactory.getVehicle("Car");
        vehicle1.drive();

        Vehicle vehicle2 = VehicleFactory.getVehicle("Bike");
        vehicle2.drive();
    }
}