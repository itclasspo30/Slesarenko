package FurModel;

public class ChairFurniture extends Furniture {

    public static final int Count = 100;

    public ChairFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostDiscount() {
        return Count*0.9;
    }

    @Override
    public String getColor() {
        return "red";
    }
}
