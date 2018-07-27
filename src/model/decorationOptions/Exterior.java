package model.decorationOptions;

import model.CarItem;

public class Exterior extends OptionDecorator {

    public static int numberOfcreated = 0;

    public Exterior(CarItem carItem) {
        super(carItem, "with Tuned Exterior");
        super.option = NameOption.EXTERIOR;
        numberOfcreated ++;
    }

    @Override
    public int getCost() {
        return super.getCost()+230;
    }
}
