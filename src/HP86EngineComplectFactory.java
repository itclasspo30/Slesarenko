public class HP86EngineComplectFactory implements EngineComplectFactory {
    @Override
    public Engine getEngine() {
        return new Vaz21008Engine();
    }

    @Override
    public Transmission getTransmission() {
        return new JR5Transmission();
    }
}
