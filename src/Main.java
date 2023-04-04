public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station1 = new ServiceStation(car);
        ServiceStation station2 = new ServiceStation(car2);
        ServiceStation station3 = new ServiceStation(truck);
        ServiceStation station4 = new ServiceStation(truck2);
        ServiceStation station5 = new ServiceStation(bicycle);
        ServiceStation station6 = new ServiceStation(bicycle2);

        station1.service();
        station2.service();
        station3.service();
        station4.service();
        station5.service();
        station6.service();

    }
}