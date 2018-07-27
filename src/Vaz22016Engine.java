public class Vaz22016Engine extends Engine {

    public Vaz22016Engine() {
        super(NameEngine._16v1800, Fuel.GASOLINE, 122);
    }

    @Override
    public int getCost() {
        return 1200;
    }
}
