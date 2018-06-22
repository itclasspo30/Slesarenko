package CarsModel;

public class PassengerCar extends Car {
    private int amountPass;

    public PassengerCar(String name, String model, int trip,
                        String color, int power, Owner owner, int amountPass) {
        super(name, model, trip, color, power, owner);
        this.amountPass = amountPass;
    }

    public int getTrip(){
        return super.trip;
    }

    public Owner getOwner(){
        return super.owner;
    }

    public int getAmountPass(){
        return amountPass;
    }
}
