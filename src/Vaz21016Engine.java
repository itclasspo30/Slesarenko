public class Vaz21016Engine extends Engine {

    public Vaz21016Engine() {
        super(NameEngine._16v1600, Fuel.GASOLINE, 108);
    }

    @Override
    public int getCost() {
        return 900;
    }
}
