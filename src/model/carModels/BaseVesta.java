package model.carModels;

import model.CarItem;

public class BaseVesta extends CarItem {

    public BaseVesta(){
        super("Vesta");

    }

    @Override
    public int getCost() {
        return 9000;
    }

    public String getName() {
        return name;
    }
}
