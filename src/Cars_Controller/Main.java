package Cars_Controller;

import CarsModel.*;

public class Main {

    public static void main(String[] args) {

        Owner[] owners = new Owner[8];
        owners[0] = new Owner("Name1", "21", "Street_1");
        owners[1] = new Owner("Name2", "22", "Street_2");
        owners[2] = new Owner("Name3", "23", "Street_3");
        owners[3] = new Owner("Name4", "24", "Street_4");
        owners[4] = new Proprietary("Name5", "35", "Street_5",
                "Company_5", "5555");
        owners[5] = new Proprietary("Name6", "36", "Street_6",
                "Company_6", "6666");
        owners[6] = new Proprietary("Name7", "37", "Street_7",
                "Company_7", "7777");
        owners[7] = new Proprietary("Name8", "38", "Street_8",
                "Company_8", "8888");

        Car[] cars = new Car[8];
        cars[0] = new PassengerCar("Car1", "Model_1", 10001, "red", 101, owners[0], 1);
        cars[1] = new PassengerCar("Car2", "Model_2", 20002, "red", 202, owners[1], 2);
        cars[2] = new Truck("Car3", "Model_3", 30003, "red", 303, owners[2], 3, 30);
        cars[3] = new Truck("Car4", "Model_4", 40004, "red", 404, owners[3], 4, 40);
        cars[4] = new PassengerCar("Car5", "Model_5", 50005, "red", 505, owners[4], 5);
        cars[5] = new PassengerCar("Car6", "Model_6", 60006, "red", 606, owners[5], 6);
        cars[6] = new Truck("Car7", "Model_7", 70007, "red", 707, owners[6], 7, 70);
        cars[7] = new Truck("Car8", "Model_8", 80008, "red", 808, owners[7], 8, 80);


        double countTrip = 0;
        int i = 0;
        for (Car car:cars) {
            if ((car instanceof Truck )||(car.getOwner() instanceof Owner)) { //не исключает юр. лиц!!!
                countTrip = countTrip + car.getTrip();
                i++;
            }
        }

        System.out.println("Средний пробег: "+countTrip/i);

        //System.out.println("Тачек - "+i);



        int countPass = 0;
        int k = 0;
        for (Car car:cars) {
            if ((car instanceof PassengerCar)) {
                countPass = countPass + ((PassengerCar) car).getAmountPass();
                k++;
            }
        }

        System.out.println("Средняя пассажировместимость: "+countPass/k);

        //System.out.println("Тачек - "+k);
    }
}
