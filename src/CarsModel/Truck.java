package CarsModel;

public class Truck extends Car implements Cargo{
    private int tonnage;
    private int volume;

    public Truck(String name, String model, int trip, String color,
                 int power, Owner owner, int tonnage, int volume) {
        super(name, model, trip, color, power, owner);
        this.tonnage = tonnage;
        this.volume = volume;
    }

    public int getTrip(){
        return super.trip;
    }

    public Owner getOwner(){
        return super.owner;
    }

    public int getTonnage(){
        return tonnage;
    }

    public int getVolume(){
        return volume;
    }
}
