package model;

abstract public class CarItem {

    public String name;

    public CarItem(String name) {
        this.name = name;
    }

    abstract public int getCost();

    @Override
    public String toString() {
        return "CarItem{" +
                "name='" + name + '\'' +
                '}';
    }
}
