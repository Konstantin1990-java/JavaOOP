public class Bicycle extends Car implements ServiceStation {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle{}";
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }
    public void check() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}
