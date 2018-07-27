package model.decorationOptions;

import model.CarItem;

public class CruiseControl extends OptionDecorator {

    public static int numberOfcreated = 0;

    public CruiseControl(CarItem carItem) {
        super(carItem, "with Cruise Control");
        super.option = NameOption.CRUISE;
        numberOfcreated ++;
    }

    @Override
    public int getCost() {
        return super.getCost()+430;
    }
}
