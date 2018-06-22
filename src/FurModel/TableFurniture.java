package FurModel;

public class TableFurniture extends Furniture {

    public static final int Count = 200;

    public TableFurniture(String name) {
        super(name);
    }

    @Override
    public double getCostDiscount() {
        return Count*0.8;
    }

    @Override
    public String getColor() {
        return "black";
    }
}
