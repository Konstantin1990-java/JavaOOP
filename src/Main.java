public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1");
        Bicycle bicycle2 = new Bicycle("bicycle2");

       ServiceStation.service(car);
       ServiceStation.service(car2);
       ServiceStation.service(truck);
       ServiceStation.service(truck2);
       ServiceStation.service(bicycle);
       ServiceStation.service(bicycle2);

    }
}