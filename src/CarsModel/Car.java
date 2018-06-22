package CarsModel;

public abstract class Car {
    String name;
    String model;
    int trip;
    String color;
    int power;
    Owner owner;

    public Car(String name, String model, int trip, String color, int power, Owner owner) {
        this.name = name;
        this.model = model;
        this.trip = trip;
        this.color = color;
        this.power = power;
        this.owner = owner;
    }

    public abstract Owner getOwner();
    public abstract int getTrip();
}
