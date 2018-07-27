package controller;

import model.CarItem;
import model.decorationOptions.*;

import java.util.List;

public class Controller {

    public int getCostAll(List<CarItem> list){
        int sum = 0;
        for(CarItem carItem:list){
            sum += carItem.getCost();
        }
        return sum;
    }


    public int getCostWithElectPakc(List<CarItem> list){
        int sum = 0;
        for(CarItem carItem:list){
            while (carItem instanceof OptionDecorator){
                if (((OptionDecorator) carItem).option == NameOption.FULLELECTRIC){
                    sum += carItem.getCost();
                }
                carItem = ((OptionDecorator)carItem).carItem;
            }
        }
        return sum;
    }


    public int getCostWithSomeOption(List<CarItem> list, NameOption option){
        int sum = 0;
        for(CarItem carItem:list){
            while (carItem instanceof OptionDecorator){
                if (((OptionDecorator) carItem).option.equals(option)){
                    sum += carItem.getCost();
                }
                carItem = ((OptionDecorator)carItem).carItem;
            }
        }
        return sum;
    }


    public int getNumberOfCreations(NameOption option){
        int quantity = 0;
        switch (option) {
            case CONDITIONER:
                quantity =  Conditioner.numberOfcreated;
                break;
            case CRUISE:
                quantity =  CruiseControl.numberOfcreated;
                break;
            case EXTERIOR:
                quantity =  Exterior.numberOfcreated;
                break;
            case FULLELECTRIC:
                quantity =  FullElectric.numberOfcreated;
                break;
            case MEDIASYSTEM:
                quantity =  MediaSystem.numberOfcreated;
                break;
        }
        return quantity;
    }
}
