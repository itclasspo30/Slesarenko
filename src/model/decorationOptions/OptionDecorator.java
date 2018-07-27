package model.decorationOptions;

import model.CarItem;

import java.util.Objects;

abstract public class OptionDecorator extends CarItem {

    public NameOption option;

    public CarItem carItem;

    public OptionDecorator (CarItem carItem, String name){
        super(carItem.name+" "+name);
        this.carItem = carItem;
    }

    @Override
    public int getCost() {
        if (carItem != null)
            return carItem.getCost();
        else return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionDecorator that = (OptionDecorator) o;
        return option == that.option &&
                Objects.equals(carItem, that.carItem);
    }

    @Override
    public int hashCode() {

        return Objects.hash(option, carItem);
    }
}
