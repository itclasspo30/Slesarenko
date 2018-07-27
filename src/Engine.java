public abstract class Engine implements CarPart {
    NameEngine nameEngine;
    Fuel fuel;
    int power;

    public Engine(NameEngine nameEngine, Fuel fuel, int power) {
        this.nameEngine = nameEngine;
        this.fuel = fuel;
        this.power = power;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public NameEngine getNameEngine() {
        return nameEngine;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "nameEngine=" + nameEngine +
                ", fuel=" + fuel +
                ", power=" + power +
                '}';
    }
}
