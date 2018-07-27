package model.carModels;

import model.CarItem;

public class BaseGranta extends CarItem {

    public BaseGranta(){
        super("Granta");
    }

    @Override
    public int getCost() {
        return 7000;
    }

    public String getName() {
        return name;
    }
}
