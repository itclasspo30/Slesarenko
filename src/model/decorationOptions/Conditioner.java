package model.decorationOptions;

import model.CarItem;

public class Conditioner extends OptionDecorator {

    public static int numberOfcreated = 0;

    public Conditioner(CarItem carItem) {
        super(carItem, "with A/C");
        super.option = NameOption.CONDITIONER;
        numberOfcreated ++;
    }

    @Override
    public int getCost() {
        return super.getCost()+530;
    }
}
