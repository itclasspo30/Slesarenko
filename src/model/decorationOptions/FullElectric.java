package model.decorationOptions;

import model.CarItem;

public class FullElectric extends OptionDecorator {

    public static int numberOfcreated = 0;

    public FullElectric(CarItem carItem) {
        super(carItem, "with Full Electric");
        super.option = NameOption.FULLELECTRIC;
        numberOfcreated ++;
    }

    @Override
    public int getCost() {
        return super.getCost()+280;
    }
}
