package model.decorationOptions;

import model.CarItem;

public class MediaSystem extends OptionDecorator {

    public static int numberOfcreated = 0;

    public MediaSystem(CarItem carItem) {
        super(carItem, "with Media System");
        super.option = NameOption.MEDIASYSTEM;
        numberOfcreated ++;
    }

    @Override
    public int getCost() {
        return super.getCost()+330;
    }
}
