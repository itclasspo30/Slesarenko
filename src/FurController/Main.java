package FurController;

import FurModel.ChairFurniture;
import FurModel.Furniture;
import FurModel.LockerFurniture;
import FurModel.TableFurniture;

public class Main {

    public static void main(String[] args) {

        Furniture[] furnitures = new Furniture[9];
        furnitures[0] = new ChairFurniture("ChairOne");
        furnitures[1] = new ChairFurniture("ChairTwo");
        furnitures[2] = new ChairFurniture("ChairThree");
        furnitures[3] = new TableFurniture("TableOne");
        furnitures[4] = new TableFurniture("TableTwo");
        furnitures[5] = new TableFurniture("TableThree");
        furnitures[6] = new LockerFurniture("LockerOne");
        furnitures[7] = new LockerFurniture("LockerTwo");
        furnitures[8] = new LockerFurniture("LockerThree");


        for(Furniture furniture:furnitures){
            System.out.println("Name: "+furniture.name+
                                 " Color: "+furniture.getColor()+
                    " Cost with discount: "+furniture.getCostDiscount());
        }

    }
}
