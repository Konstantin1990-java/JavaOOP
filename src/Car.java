public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return super.toString() + "Car{}";
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
}
