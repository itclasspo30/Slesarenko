public class HP108EngineComplectFactory implements EngineComplectFactory {
    @Override
    public Engine getEngine() {
        return new Vaz21016Engine();
    }

    @Override
    public Transmission getTransmission() {
        return new JatcoTransmission();
    }
}
