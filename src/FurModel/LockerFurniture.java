package FurModel;

public class LockerFurniture extends Furniture {

    public static final int Count = 300;

    public LockerFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostDiscount() {
        return Count*0.7;
    }

    @Override
    public String getColor() {
        return "yellow";
    }
}
