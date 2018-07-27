import controller.Controller;
import model.CarItem;
import model.carModels.BaseGranta;
import model.carModels.BaseVesta;
import model.decorationOptions.*;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
        ArrayList<CarItem> carList = new ArrayList<>();

        carList.add(new Exterior(new CruiseControl(new MediaSystem(new Conditioner(new BaseGranta())))));
        carList.add(new MediaSystem(new FullElectric(new Exterior (new Conditioner(new BaseVesta())))));
        carList.add(new MediaSystem(new FullElectric(new Exterior(new CruiseControl(new Conditioner(new BaseGranta()))))));
        carList.add(new MediaSystem(new FullElectric(new Exterior(new CruiseControl(new BaseVesta())))));
        carList.add(new MediaSystem(new Exterior(new CruiseControl(new Conditioner(new BaseGranta())))));
        carList.add(new MediaSystem(new FullElectric(new Exterior(new CruiseControl(new Conditioner(new BaseVesta()))))));
        carList.add(new FullElectric(new Exterior(new CruiseControl(new Conditioner(new BaseGranta())))));
        carList.add(new MediaSystem(new FullElectric(new Exterior(new CruiseControl(new Conditioner(new BaseVesta()))))));
        carList.add(new BaseGranta());

        System.out.println("List of Cars:");

        for(CarItem car:carList){
            System.out.println(car.toString());
        }

        System.out.println("Cost of all cars: " + controller.getCostAll(carList));

        System.out.println("Cost of cars With Electric Pack: " + controller.getCostWithElectPakc(carList));
        System.out.println("Quantity of cars With Electric Pack: " + controller.getNumberOfCreations(NameOption.FULLELECTRIC));

        System.out.println("Cost of cars With Some Option (conditioner): " + controller.getCostWithSomeOption(carList, NameOption.CONDITIONER));
        System.out.println("Quantity of cars With Some Option (conditioner): " + controller.getNumberOfCreations(NameOption.CONDITIONER));
    }
}