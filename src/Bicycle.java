public class Bicycle extends Transport {
    public Bicycle(String modelName) {
        super(modelName);
        this.setWheelsCount(2);
    }

    @Override
    public String toString() {
        return super.toString() + "Bicycle{}";
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void check() {
       super.check();
    }
}
