import java.util.ArrayList;

public class Purchase {

    ArrayList<CarPart>carParts = new ArrayList<>();

    CarPlatform carPlatform;
    Engine engine;
    Transmission transmission;
    boolean audio = false;
    boolean conditioner = false;
    boolean cruise = false;

    int cost = 0;

    public Purchase (CarPlatform carPlatform, EngineComplectFactory engineComplect,
                     boolean audio, boolean conditioner, boolean cruise){
        this.carPlatform = carPlatform;
        carParts.add(carPlatform);
        this.engine = engineComplect.getEngine();
        carParts.add(engine);
        this.transmission = engineComplect.getTransmission();
        carParts.add(transmission);
        if(audio == true) {
            this.audio = true;
            carParts.add(new Audiosystem());
        }
        if(conditioner == true) {
            this.conditioner = true;
            carParts.add(new Conditioner());
        }
        if(cruise == true) {
            this.cruise = true;
            carParts.add(new Cruisecontrol());
        }
    }

    int getCost(){
        for (CarPart carPart:carParts) {
            cost += carPart.getCost();
        }
        return cost;
    }

    Fuel getTypeFuel(){
        return engine.getFuel();
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "carPlatform=" + carPlatform +
                ", engine=" + engine +
                ", transmission=" + transmission +
                ", total cost=" + cost +
                ", fuel" + engine.getFuel() +
                ", A/C" + cruise +
                '}';
    }
}
