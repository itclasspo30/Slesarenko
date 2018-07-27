public class Vaz21008Engine extends Engine {

    public Vaz21008Engine() {
        super(NameEngine._8v1600, Fuel.DIESEL, 86);
    }

    @Override
    public int getCost() {
        return 1100;
    }
}
